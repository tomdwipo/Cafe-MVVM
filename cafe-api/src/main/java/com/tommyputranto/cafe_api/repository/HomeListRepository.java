package com.tommyputranto.cafe_api.repository;

import com.tommyputranto.cafe_api.core.CafeApi;
import com.tommyputranto.cafe_api.dao.HomeListDao;

import rx.Observable;

/**
 * Created by tommy on 9/17/16.
 */
public class HomeListRepository {
    CafeApi mCafeApi;
    public HomeListRepository(CafeApi cafeApi){
        mCafeApi = cafeApi;

    }
    public Observable<HomeListDao> getHomeList(){
        return mCafeApi.getApiService().getHomeList();
    }
}
