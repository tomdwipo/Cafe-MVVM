package com.tommyputranto.cafe_api.core;

import com.tommyputranto.cafe_api.ApiService;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tommy on 9/17/16.
 */
public class CafeApi {
    ApiService mApiService;

    public CafeApi(String baseUrl) {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new ApiInterceptor())
                .readTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(30, TimeUnit.SECONDS)

                .build();


        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .baseUrl(baseUrl)
                .build();
        mApiService = retrofit.create(ApiService.class);
    }
    public ApiService getApiService() {
        return mApiService;
    }

}
