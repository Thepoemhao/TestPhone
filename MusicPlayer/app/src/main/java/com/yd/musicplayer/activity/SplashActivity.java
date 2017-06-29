package com.yd.musicplayer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.yd.musicplayer.MainActivity;
import com.yd.musicplayer.R;
import com.yd.musicplayer.presenter.contract.SplashContract;
import com.yd.musicplayer.presenter.implant.SplashPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class SplashActivity extends BaseActivity implements SplashContract.View {

    private SplashPresenter splashPresenter;


    @BindView(R.id.splash_btn_jump)
    Button splashBtnJump;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //取消标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        //取消状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

        //实例化对象
        splashPresenter = new SplashPresenter(this);

        //
        splashPresenter.timingBegin();
    }

    //点击事件
    @OnClick(R.id.splash_btn_jump)
    public void onViewClicked() {


        splashPresenter.startIntent();
    }

    @Override
    public void intent2MainActivity() {
        //实例化意图对象，跳转到Mainactivity
        Intent intent = new Intent(this, MainActivity.class);
        //开始跳转
        startActivity(intent);
        //跳转后关闭此界面
        finish();
    }

    //在本页面返回键失效（防止在计时返回到桌面，计时结束程序跳出来）把super刪掉
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }


}
