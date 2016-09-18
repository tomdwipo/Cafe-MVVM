package com.tommyputranto.cafe.mvvm.home;

import android.os.Bundle;

import com.tommyputranto.cafe.constant.CafeApp;
import com.tommyputranto.cafe.databinding.HomeActivityBinding;
import com.tommyputranto.cafe.mvvm.base.BaseController;
import com.tommyputranto.cafe_api.core.MyObserver;
import com.tommyputranto.cafe_api.dao.HomeListDao;
import com.tommyputranto.cafe_api.repository.HomeListRepository;

import java.util.ArrayList;
import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by tommy on 9/17/16.
 */
public class HomeActivityController extends BaseController<HomeActivityVM, HomeActivityBinding> {
    private HomeListRepository mHomeListRepository;
    public List<HomeListDao.DATABean> mData = new ArrayList<>();
    @Override
    public HomeActivityVM createViewModel(HomeActivityBinding binding) {
        return new HomeActivityVM(mActivity, this, binding);
    }

    @Override
    public void bindViewModel(HomeActivityBinding binding, HomeActivityVM viewModel) {
        binding.setVm(viewModel);
    }
    HomeActivityController(){
        mHomeListRepository = new HomeListRepository(CafeApp.getApi());
    }
    public void getHomeList(){
        addSubscription(mHomeListRepository.getHomeList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MyObserver<HomeListDao>() {
                    @Override
                    public void onApiResultCompleted() {

                    }

                    @Override
                    public void onApiResultError(String message, String code) {

                    }

                    @Override
                    public void onApiResultOk(HomeListDao homeListDao) {
                        mData.addAll(homeListDao.getDATA());
                        mViewModel.adapterNotify();

                    }
                }));
    }

    @Override
    public void onCreateController(Bundle savedInstanceState) {
        super.onCreateController(savedInstanceState);
        getHomeList();
    }
}
