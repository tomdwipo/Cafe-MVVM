package com.tommyputranto.cafe.constant;

import android.app.Application;

import com.tommyputranto.cafe_api.core.CafeApi;

/**
 * Created by tommy on 9/17/16.
 */
public class CafeApp extends Application {
    private static CafeApi mCafeApi;


    public static CafeApi getApi() {
        if (mCafeApi == null) {
            mCafeApi = new CafeApi(Constant.BASE_URL);
        }
        return mCafeApi;
    }
}
