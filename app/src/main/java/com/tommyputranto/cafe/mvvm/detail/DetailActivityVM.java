package com.tommyputranto.cafe.mvvm.detail;

import android.support.v7.app.AppCompatActivity;

import com.tommyputranto.cafe.databinding.DetailActivityBinding;
import com.tommyputranto.cafe.mvvm.base.BaseVM;

/**
 * Created by tommy on 9/17/16.
 */
public class DetailActivityVM extends BaseVM<DetailActivityController, DetailActivityBinding> {
    public DetailActivityVM(AppCompatActivity activity, DetailActivityController controller, DetailActivityBinding binding) {
        super(activity, controller, binding);
    }
}
