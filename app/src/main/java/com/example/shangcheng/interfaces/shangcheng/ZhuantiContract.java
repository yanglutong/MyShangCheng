package com.example.shangcheng.interfaces.shangcheng;

import com.example.shangcheng.interfaces.IBaseView;
import com.example.shangcheng.interfaces.IPersenter;
import com.example.shangcheng.model.bean.ZhuantiBean;

public interface ZhuantiContract {
    interface View extends IBaseView {
        void getZhuantiResult(ZhuantiBean result);
    }

    interface Persenter extends IPersenter<View> {
        void getZhuantibean(int page,int size);
    }
}
