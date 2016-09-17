package com.tommyputranto.cafe.mvvm.base;

import android.databinding.ViewDataBinding;

import id.gits.mvvmcore.controller.GitsController;
import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by tommy on 9/17/16.
 */
public abstract class BaseController<VM extends GitsVM, B extends ViewDataBinding> extends GitsController<VM, B> {
}