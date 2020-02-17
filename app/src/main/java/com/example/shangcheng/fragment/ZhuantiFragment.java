package com.example.shangcheng.fragment;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shangcheng.R;
import com.example.shangcheng.adapter.ZhuantiAdapter;
import com.example.shangcheng.base.BaseFragment;
import com.example.shangcheng.interfaces.IPersenter;
import com.example.shangcheng.interfaces.shangcheng.ZhuantiContract;
import com.example.shangcheng.model.bean.ZhuantiBean;
import com.example.shangcheng.presenter.ZhuantiPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class ZhuantiFragment extends BaseFragment implements ZhuantiContract.View {
    @BindView(R.id.rv_zhuanti)
    RecyclerView rvZhuanti;
    private ArrayList<ZhuantiBean.DataBeanX.DataBean> dataBeans;
    private ZhuantiAdapter adapter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_zhuanti;
    }

    @Override
    protected void initView(View view) {
        rvZhuanti.setLayoutManager(new LinearLayoutManager(context));
        dataBeans = new ArrayList<>();
        adapter = new ZhuantiAdapter(context, dataBeans);
        rvZhuanti.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        int page = 1;
        int size = 10;
        ((ZhuantiPresenter) persenter).getZhuantibean(page,size);
    }

    @Override
    protected IPersenter createPersenter() {
        return new ZhuantiPresenter();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError(String err) {

    }

    @Override
    public void getZhuantiResult(ZhuantiBean result) {
        List<ZhuantiBean.DataBeanX.DataBean> data = result.getData().getData();
        dataBeans.addAll(data);
        adapter.notifyDataSetChanged();
    }
}
