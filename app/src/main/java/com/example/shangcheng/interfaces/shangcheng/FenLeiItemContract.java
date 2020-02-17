package com.example.shangcheng.interfaces.shangcheng;

import com.example.shangcheng.interfaces.IBaseView;
import com.example.shangcheng.interfaces.IPersenter;
import com.example.shangcheng.model.bean.FenLei_TabBean;

public interface FenLeiItemContract {
    interface View extends IBaseView {
        void FenLeiItemDataReturn(FenLei_TabBean fenLei_tabBean);
    }

    interface Persenter extends IPersenter<View> {
        void getFenLeiItemData(int id);
    }
}
