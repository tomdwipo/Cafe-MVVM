package com.tommyputranto.cafe_api.core;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by tommy on 9/17/16.
 */
public class ApiInterceptor implements Interceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        Request requestWithUserAgent = originalRequest.newBuilder()
                .build();
        return chain.proceed(requestWithUserAgent);
    }
}