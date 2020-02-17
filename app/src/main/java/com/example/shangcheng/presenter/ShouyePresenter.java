package com.example.shangcheng.presenter;

import com.example.shangcheng.base.BasePersenter;
import com.example.shangcheng.interfaces.shangcheng.ShouyeContract;
import com.example.shangcheng.model.CommonSubscriber;
import com.example.shangcheng.model.bean.ShouYeBean;
import com.example.shangcheng.model.http.HttpManager;
import com.example.shangcheng.utils.RxUtils;

public class ShouyePresenter extends BasePersenter<ShouyeContract.View> implements ShouyeContract.Persenter{

    @Override
    public void getshouye() {
        addSubscribe(HttpManager.getShouyeApi().getShouyeData()
                .compose(RxUtils.<ShouYeBean> rxScheduler())
                .subscribeWith(new CommonSubscriber<ShouYeBean>(mView){
                    @Override
                    public void onNext(ShouYeBean result) {
                        mView.getshouyeReturn(result);
                    }
                }));
    }
}
