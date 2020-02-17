package com.example.shangcheng.presenter;

import com.example.shangcheng.base.BasePersenter;
import com.example.shangcheng.interfaces.shangcheng.FenLeiContract;
import com.example.shangcheng.model.CommonSubscriber;
import com.example.shangcheng.model.bean.FenLeiBean;
import com.example.shangcheng.model.http.HttpManager;
import com.example.shangcheng.utils.RxUtils;

public class FenLeiPersenter extends BasePersenter<FenLeiContract.View> implements FenLeiContract.Persenter{

    @Override
    public void getFenLeiData() {
        addSubscribe(HttpManager.getFenLeiApi().getFenLeiBean()
                .compose(RxUtils.<FenLeiBean> rxScheduler())
                .subscribeWith(new CommonSubscriber<FenLeiBean>(mView){
                    @Override
                    public void onNext(FenLeiBean fenLeiBean) {
                        mView.FenLeiDataReturn(fenLeiBean);
                    }
                }));
    }
}
