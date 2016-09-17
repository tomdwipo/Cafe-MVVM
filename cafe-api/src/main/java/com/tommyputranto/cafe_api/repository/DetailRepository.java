package com.tommyputranto.cafe_api.repository;

import com.tommyputranto.cafe_api.core.CafeApi;
import com.tommyputranto.cafe_api.dao.DetailDao;

import rx.Observable;

/**
 * Created by tommy on 9/17/16.
 */
public class DetailRepository  {
    CafeApi mCafeApi;
    public DetailRepository(CafeApi cafeApi){
        mCafeApi = cafeApi;

    }
    public Observable<DetailDao> getDetail(String id){
        return mCafeApi.getApiService().getDetail(id);
    }
}
