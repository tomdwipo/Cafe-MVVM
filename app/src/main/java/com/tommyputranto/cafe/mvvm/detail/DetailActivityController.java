package com.tommyputranto.cafe.mvvm.detail;

import com.tommyputranto.cafe.databinding.DetailActivityBinding;
import com.tommyputranto.cafe.mvvm.base.BaseController;

/**
 * Created by tommy on 9/17/16.
 */
public class DetailActivityController extends BaseController<DetailActivityVM, DetailActivityBinding> {

    @Override
    public DetailActivityVM createViewModel(DetailActivityBinding binding) {
        return new DetailActivityVM(mActivity, this, binding);
    }

    @Override
    public void bindViewModel(DetailActivityBinding binding, DetailActivityVM viewModel) {
binding.setVm(viewModel);
    }

}
