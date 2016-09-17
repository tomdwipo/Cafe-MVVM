package com.tommyputranto.cafe.mvvm.base;

import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;

import com.tommyputranto.cafe.R;

import id.gits.mvvmcore.controller.GitsController;
import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by tommy on 9/17/16.
 */
public abstract class BaseVM<C extends GitsController, B extends ViewDataBinding> extends GitsVM<C, B> {
    public ToolbarVM bToolbarVM;

    public BaseVM(AppCompatActivity activity, C controller, B binding) {
        super(activity, controller, binding);

        if (activity.getSupportActionBar() != null)
            activity.getSupportActionBar().setDisplayShowTitleEnabled(false);

        bToolbarVM = new ToolbarVM(activity.getString(R.string.app_name), "");
    }
}