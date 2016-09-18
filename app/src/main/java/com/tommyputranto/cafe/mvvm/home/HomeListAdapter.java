package com.tommyputranto.cafe.mvvm.home;

import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.tommyputranto.cafe.R;
import com.tommyputranto.cafe.databinding.HomeListBinding;
import com.tommyputranto.cafe.mvvm.base.BaseAdapter;
import com.tommyputranto.cafe_api.dao.HomeListDao;

import java.util.List;

/**
 * Created by tommy on 9/17/16.
 */
public class HomeListAdapter extends BaseAdapter<HomeListDao.DATABean, HomeListVM, HomeListBinding> {
    private HomeActivityController controller;
    public HomeListAdapter(List<HomeListDao.DATABean> collection, HomeActivityController controller) {
        super(collection);
        this.controller = controller;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return super.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(BindingHolder<HomeListBinding> holder, int position) {
        super.onBindViewHolder(holder, position);
    }

    @Override
    public HomeListVM createViewModel(AppCompatActivity activity, HomeListBinding binding, HomeListDao.DATABean item, int position) {
        return new HomeListVM(activity, binding, item, controller);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.home_list;
    }

    @Override
    public void render(HomeListBinding binding, HomeListVM viewModel, HomeListDao.DATABean item) {
        binding.setVm(viewModel);
    }

    @Override
    public void onRowClick(HomeListDao.DATABean data, int position) {

    }
}
