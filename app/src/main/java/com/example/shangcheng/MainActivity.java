package com.example.shangcheng;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.shangcheng.adapter.MainAdapter;
import com.example.shangcheng.fragment.FenLeiFragment;
import com.example.shangcheng.fragment.MineFragment;
import com.example.shangcheng.fragment.ShopFragment;
import com.example.shangcheng.fragment.ShouyeFragment;
import com.example.shangcheng.fragment.ZhuantiFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewPager vp_main;
    private RadioButton shou_main;
    private RadioButton zhuan_main;
    private RadioButton fen_main;
    private RadioButton shop_main;
    private RadioButton mine_main;
    private RadioGroup rg_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }


    private void initView() {
        vp_main = (ViewPager) findViewById(R.id.vp_main);
        shou_main = (RadioButton) findViewById(R.id.shou_main);
        zhuan_main = (RadioButton) findViewById(R.id.zhuan_main);
        fen_main = (RadioButton) findViewById(R.id.fen_main);
        shop_main = (RadioButton) findViewById(R.id.shop_main);
        mine_main = (RadioButton) findViewById(R.id.mine_main);
        rg_main = (RadioGroup) findViewById(R.id.rg_main);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new ShouyeFragment());
        fragments.add(new ZhuantiFragment());
        fragments.add(new FenLeiFragment());
        fragments.add(new ShopFragment());
        fragments.add(new MineFragment());

        MainAdapter adapter = new MainAdapter(getSupportFragmentManager(), fragments);
        vp_main.setAdapter(adapter);

        shou_main.setOnClickListener(this);
        zhuan_main.setOnClickListener(this);
        mine_main.setOnClickListener(this);
        fen_main.setOnClickListener(this);
        shop_main.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.shou_main:
                vp_main.setCurrentItem(0);
                break;
            case R.id.zhuan_main:
                vp_main.setCurrentItem(1);
                break;
            case R.id.fen_main:
                vp_main.setCurrentItem(2);
                break;
            case R.id.shop_main:
                vp_main.setCurrentItem(3);
                break;
            case R.id.mine_main:
                vp_main.setCurrentItem(4);
                break;
        }
    }
}
