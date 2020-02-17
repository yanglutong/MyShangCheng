package com.example.shangcheng.model.apis;

import com.example.shangcheng.model.bean.FenLei_TabBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FenLeiItenApi {
    @GET("catalog/index")
    Flowable<FenLei_TabBean> getFenLeitemBean(@Query("id") int id);
}
