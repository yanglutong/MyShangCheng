package com.example.shangcheng.interfaces.shangcheng;

import com.example.shangcheng.interfaces.IBaseView;
import com.example.shangcheng.interfaces.IPersenter;
import com.example.shangcheng.model.bean.ShouYeBean;

public interface ShouyeContract {
    interface View extends IBaseView {
        void getshouyeReturn(ShouYeBean shouYeBean);
    }

    interface Persenter extends IPersenter<View> {
        void getshouye();
    }
}
