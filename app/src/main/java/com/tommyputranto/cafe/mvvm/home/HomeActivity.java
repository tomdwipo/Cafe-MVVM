package com.tommyputranto.cafe.mvvm.home;

import com.tommyputranto.cafe.R;
import com.tommyputranto.cafe.mvvm.base.BaseActivity;

/**
 * Created by tommy on 9/17/16.
 */
public class HomeActivity extends BaseActivity<HomeActivityController> {
    @Override
    protected int getToolbarId() {
        return 0;
    }

    @Override
    protected int getResLayout() {
        return R.layout.home_activity;
    }

    @Override
    protected HomeActivityController createController() {
        return new HomeActivityController();
    }
}
