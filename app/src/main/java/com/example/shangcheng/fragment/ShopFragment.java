package com.example.shangcheng.fragment;

import android.view.View;

import com.example.shangcheng.R;
import com.example.shangcheng.base.BaseFragment;
import com.example.shangcheng.interfaces.IPersenter;

public class ShopFragment extends BaseFragment {
    @Override
    protected int getLayout() {
        return R.layout.fragment_shop;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected IPersenter createPersenter() {
        return null;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError(String err) {

    }
}
