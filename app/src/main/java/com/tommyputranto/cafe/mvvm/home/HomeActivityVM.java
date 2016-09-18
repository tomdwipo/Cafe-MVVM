package com.tommyputranto.cafe.mvvm.home;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.tommyputranto.cafe.databinding.HomeActivityBinding;
import com.tommyputranto.cafe.mvvm.base.BaseVM;

/**
 * Created by tommy on 9/17/16.
 */
public class HomeActivityVM extends BaseVM<HomeActivityController, HomeActivityBinding> {
    public LinearLayoutManager bLayoutManager;
    public HomeListAdapter bAdapter;
    public HomeActivityVM(AppCompatActivity activity, HomeActivityController controller, HomeActivityBinding binding) {
        super(activity, controller, binding);
        bLayoutManager = new LinearLayoutManager(activity);
        bAdapter = new HomeListAdapter(mController.mData, controller);

    }
    public void adapterNotify() {
        bAdapter.notifyDataSetChanged();
    }
}
