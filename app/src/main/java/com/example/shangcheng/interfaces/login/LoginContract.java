package com.example.shangcheng.interfaces.login;


import com.example.shangcheng.interfaces.IBaseView;
import com.example.shangcheng.interfaces.IPersenter;
import com.example.shangcheng.model.bean.LoginBean;

//契约类
public interface LoginContract {

    interface View extends IBaseView {
        void loginReturn(LoginBean loginBean);
    }

    interface Persenter extends IPersenter<View> {
        void login(String username, String password);

        void getCollection();

        void loginCart(String username, String password);
    }


}
