package com.example.shangcheng.presenter;

import com.example.shangcheng.base.BasePersenter;
import com.example.shangcheng.interfaces.shangcheng.FenLeiItemContract;
import com.example.shangcheng.model.CommonSubscriber;
import com.example.shangcheng.model.bean.FenLei_TabBean;
import com.example.shangcheng.model.http.HttpManager;
import com.example.shangcheng.utils.RxUtils;

public class FenLeiItemPersenter extends BasePersenter<FenLeiItemContract.View> implements FenLeiItemContract.Persenter {
    @Override
    public void getFenLeiItemData(int id) {
        addSubscribe(HttpManager.getFenLeiItemApi().getFenLeitemBean(id)
                .compose(RxUtils.<FenLei_TabBean> rxScheduler())
                .subscribeWith(new CommonSubscriber<FenLei_TabBean>(mView){
                    @Override
                    public void onNext(FenLei_TabBean fenLei_tabBean) {
                        mView.FenLeiItemDataReturn(fenLei_tabBean);
                    }
                }));
    }
}
