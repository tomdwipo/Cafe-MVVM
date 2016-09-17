package com.tommyputranto.cafe_api;

import com.tommyputranto.cafe_api.dao.DetailDao;
import com.tommyputranto.cafe_api.dao.HomeListDao;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by tommy on 9/17/16.
 */
public interface ApiService {
    @GET("public/list")
    Observable<HomeListDao> getHomeList();

    @GET("public/lis/{id}")
    Observable<DetailDao> getDetail(@Path("id") String id);

}
