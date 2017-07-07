package com.yd.testdagger2;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Inject
    OneFragment oneFragment;

    @Inject
    TwoFragment twoFragment;

    @BindView(R.id.one)
    FrameLayout one;
    @BindView(R.id.two)
    FrameLayout two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        DaggerFragmentComponent
                .builder()
                .fragmentModule(new FragmentModule())
                .build()
                .inject(this);

        //得到布局管理器——开启事务
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        //替换Fragment
        transaction.add(R.id.one, oneFragment);
        transaction.add(R.id.two, twoFragment);
        //提交
        transaction.commit();
    }

    //调用twofrangment得到数据的方法
    public void getDataByTwo() {
        twoFragment.getData();
    }

}
