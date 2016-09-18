package com.tommyputranto.cafe.mvvm.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import id.gits.mvvmcore.activity.GitsActivity;
import id.gits.mvvmcore.controller.GitsController;

/**
 * Created by tommy on 9/17/16.
 */
public abstract class BaseActivity<C extends GitsController> extends GitsActivity<C> {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        EventBus.getDefault().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

      //  EventBus.getDefault().unregister(this);
    }


}
