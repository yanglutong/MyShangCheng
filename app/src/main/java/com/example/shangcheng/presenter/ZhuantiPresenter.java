package com.example.shangcheng.presenter;

import com.example.shangcheng.base.BasePersenter;
import com.example.shangcheng.interfaces.shangcheng.ZhuantiContract;
import com.example.shangcheng.model.CommonSubscriber;
import com.example.shangcheng.model.bean.ZhuantiBean;
import com.example.shangcheng.model.http.HttpManager;
import com.example.shangcheng.utils.RxUtils;

public class ZhuantiPresenter extends BasePersenter<ZhuantiContract.View> implements ZhuantiContract.Persenter {


    @Override
    public void getZhuantibean(int page, int size) {
        addSubscribe(HttpManager.getShouyeApi().getZhuantiData(1,10)
                .compose(RxUtils.<ZhuantiBean> rxScheduler())
                .subscribeWith(new CommonSubscriber<ZhuantiBean>(mView){
                    @Override
                    public void onNext(ZhuantiBean result) {
                        mView.getZhuantiResult(result);
                    }
                }));
    }
}
