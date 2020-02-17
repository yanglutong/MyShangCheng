package com.example.shangcheng.model.apis;

import com.example.shangcheng.model.bean.FenLeiBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface FenLeiApi {

    @GET("catalog/index")
    Flowable<FenLeiBean> getFenLeiBean();
}
