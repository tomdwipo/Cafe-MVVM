package com.tommyputranto.cafe_api.core;

import com.google.gson.Gson;
import com.tommyputranto.cafe_api.dao.BaseApiDao;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import okhttp3.ResponseBody;
import retrofit2.adapter.rxjava.HttpException;
import rx.Observer;

/**
 * Created by tommy on 9/17/16.
 */
public abstract class MyObserver<T extends BaseApiDao> implements Observer<T> {

    @Override
    public final void onCompleted() {
        onApiResultCompleted();
    }

    @Override
    public final void onError(Throwable e) {
        if (e instanceof HttpException) {
            try {
                ResponseBody body = ((HttpException) e).response().errorBody();
                BaseApiDao apiDao = new Gson().fromJson(body.string(), BaseApiDao.class);
                onApiResultError(apiDao.getMessage(), apiDao.getCode());
            } catch (Exception e2) {
                e2.printStackTrace();
                onApiResultError("Terjadi kesalahan, ", "exception");
            }
            onApiResultCompleted();
        } else if (e instanceof UnknownHostException) {
            onApiResultError("Koneksi terputus, silahkan coba lagi", "exception");
        } else if (e instanceof SocketTimeoutException) {
            onApiResultError("Koneksi terputus, silahkan coba lagi", "exception");
        } else {
            System.err.println(e.getMessage());
            e.printStackTrace();
            onApiResultError("Terjadi kesalahan, ", "exception");
        }
    }

    @Override
    public final void onNext(T t) {
        if (t.getCode() != null && t.getCode().contains("failed")) {
            onApiResultError(t.getMessage(), "failed");
        } else {
            onApiResultOk(t);
        }
    }

    public abstract void onApiResultCompleted();

    public abstract void onApiResultError(String message, String code);

    public abstract void onApiResultOk(T t);
}