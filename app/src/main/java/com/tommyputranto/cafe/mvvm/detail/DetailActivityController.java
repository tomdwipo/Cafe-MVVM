package com.tommyputranto.cafe.mvvm.detail;

import com.tommyputranto.cafe.constant.CafeApp;
import com.tommyputranto.cafe.databinding.DetailActivityBinding;
import com.tommyputranto.cafe.mvvm.base.BaseController;
import com.tommyputranto.cafe_api.core.MyObserver;
import com.tommyputranto.cafe_api.dao.DetailDao;
import com.tommyputranto.cafe_api.repository.DetailRepository;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by tommy on 9/17/16.
 */
public class DetailActivityController extends BaseController<DetailActivityVM, DetailActivityBinding> {
    private DetailRepository mDetailRepository;
    @Override
    public DetailActivityVM createViewModel(DetailActivityBinding binding) {
        return new DetailActivityVM(mActivity, this, binding);
    }

    @Override
    public void bindViewModel(DetailActivityBinding binding, DetailActivityVM viewModel) {
binding.setVm(viewModel);
    }
    DetailActivityController(){
        mDetailRepository = new DetailRepository(CafeApp.getApi());
    }
    public void getDetail(String id){
        addSubscription(mDetailRepository.getDetail(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MyObserver<DetailDao>() {
                    @Override
                    public void onApiResultCompleted() {

                    }

                    @Override
                    public void onApiResultError(String message, String code) {

                    }

                    @Override
                    public void onApiResultOk(DetailDao detailDao) {

                    }

                }));
    }

}
