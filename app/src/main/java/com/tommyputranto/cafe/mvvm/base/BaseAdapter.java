package com.tommyputranto.cafe.mvvm.base;

import android.databinding.ViewDataBinding;

import java.util.List;

import id.gits.mvvmcore.adapter.GitsAdapter;
import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by tommy on 9/17/16.
 */
public abstract class BaseAdapter<T, VM extends GitsRowVM, B extends ViewDataBinding> extends GitsAdapter<T, VM, B> {
    public BaseAdapter(List<T> collection) {
        super(collection);
    }
}