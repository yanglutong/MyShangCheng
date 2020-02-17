package com.example.shangcheng.fragment.shouye;

import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shangcheng.R;
import com.example.shangcheng.base.BaseFragment;
import com.example.shangcheng.interfaces.IPersenter;
import com.example.shangcheng.interfaces.shangcheng.ShouyeContract;
import com.example.shangcheng.model.bean.ShouYeBean;
import com.example.shangcheng.presenter.ShouyePresenter;

import butterknife.BindView;

public class JujiaFragment extends BaseFragment implements ShouyeContract.View{
    @BindView(R.id.rv_jujia)
    RecyclerView rvJujia;

    @Override
    protected int getLayout() {
        return R.layout.fragment_jujia;
    }

    @Override
    protected void initView(View view) {
        rvJujia.setLayoutManager(new GridLayoutManager(context,2));

    }

    @Override
    protected void initData() {
        ((ShouyePresenter)persenter).getshouye();
    }

    @Override
    protected IPersenter createPersenter() {
        return new ShouyePresenter();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError(String err) {

    }

    @Override
    public void getshouyeReturn(ShouYeBean shouYeBean) {
        ShouYeBean.DataBean data = shouYeBean.getData();

    }
}
