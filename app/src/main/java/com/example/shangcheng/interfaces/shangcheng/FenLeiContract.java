package com.example.shangcheng.interfaces.shangcheng;

import com.example.shangcheng.interfaces.IBaseView;
import com.example.shangcheng.interfaces.IPersenter;
import com.example.shangcheng.model.bean.FenLeiBean;

public interface FenLeiContract {
    interface View extends IBaseView {
        void FenLeiDataReturn(FenLeiBean fenLeiBean);
    }

    interface Persenter extends IPersenter<View> {
        void getFenLeiData();
    }
}
