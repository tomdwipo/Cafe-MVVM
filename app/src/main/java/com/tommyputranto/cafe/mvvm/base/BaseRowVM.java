package com.tommyputranto.cafe.mvvm.base;

import android.content.Context;
import android.databinding.ViewDataBinding;

import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by tommy on 9/17/16.
 */
public class BaseRowVM<T, B extends ViewDataBinding> extends GitsRowVM<T, B> {
    public BaseRowVM(Context context, B binding, T data) {
        super(context, binding, data);
    }
}