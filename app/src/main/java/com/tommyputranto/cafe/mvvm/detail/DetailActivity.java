package com.tommyputranto.cafe.mvvm.detail;

import com.tommyputranto.cafe.R;
import com.tommyputranto.cafe.mvvm.base.BaseActivity;

/**
 * Created by tommy on 9/17/16.
 */
public class DetailActivity extends BaseActivity<DetailActivityController> {
    @Override
    protected int getToolbarId() {
        return 0;
    }

    @Override
    protected int getResLayout() {
        return R.layout.detail_activity;
    }

    @Override
    protected DetailActivityController createController() {
        return new DetailActivityController();
    }
}
