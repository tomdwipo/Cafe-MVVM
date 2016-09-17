package com.tommyputranto.cafe.mvvm.base;

import android.databinding.ObservableField;

/**
 * Created by tommy on 9/17/16.
 */
public class ToolbarVM {
    public ObservableField<String> bTextToolbarTitle = new ObservableField<>();
    public ObservableField<String> bTextToolbarSubtitle = new ObservableField<>();

    public ToolbarVM(String toolbarTitle, String toolbarSubtitle) {
        this.bTextToolbarTitle.set(toolbarTitle);
        this.bTextToolbarSubtitle.set(toolbarSubtitle);
    }

    public void setToolbarTitle(String toolbarTitle) {
        this.bTextToolbarTitle.set(toolbarTitle);
    }

    public void setToolbarSubtitle(String toolbarSubtitle) {
        this.bTextToolbarSubtitle.set(toolbarSubtitle);
    }
}