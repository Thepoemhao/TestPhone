package com.yd.musicplayer.presenter.implant;

import android.os.Handler;
import android.os.Message;

import com.yd.musicplayer.activity.BaseActivity;
import com.yd.musicplayer.activity.SplashActivity;
import com.yd.musicplayer.presenter.contract.SplashContract;

/**
 * Created by DELL on 2017/6/28.
 */

public class SplashPresenter extends BaseActivity implements SplashContract.presenter {
    private int WHIT = 1;
    private int TIME = 3000;
    private SplashActivity splashActivity;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            splashActivity.intent2MainActivity();

        }
    };

    //构造方法
    public SplashPresenter(SplashActivity splashActivity) {

        this.splashActivity = splashActivity;
    }

    // 计时跳转
    @Override
    public void timingBegin() {
        handler.sendEmptyMessageDelayed(WHIT, TIME);
    }

    //点击跳转
    @Override
    public void startIntent() {
        //点击跳过按钮后移除计时消息
        handler.removeMessages(WHIT);

        //
        splashActivity.intent2MainActivity();
    }
}
