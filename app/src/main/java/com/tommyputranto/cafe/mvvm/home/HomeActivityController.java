package com.tommyputranto.cafe.mvvm.home;

import com.tommyputranto.cafe.databinding.HomeActivityBinding;
import com.tommyputranto.cafe.mvvm.base.BaseController;

/**
 * Created by tommy on 9/17/16.
 */
public class HomeActivityController extends BaseController<HomeActivityVM, HomeActivityBinding> {
    @Override
    public HomeActivityVM createViewModel(HomeActivityBinding binding) {
        return new HomeActivityVM(mActivity, this, binding);
    }

    @Override
    public void bindViewModel(HomeActivityBinding binding, HomeActivityVM viewModel) {
        binding.setVm(viewModel);
    }
}
