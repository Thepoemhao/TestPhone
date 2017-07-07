package com.yd.musicplay.presenter.impl;

import android.os.Handler;
import android.os.Message;

import com.yd.musicplay.presenter.contract.SplashContract;

/**
 * Created by DELL on 2017/7/4.
 * splash 的presenter实现类
 */

public class SplashPresenter implements SplashContract.Presenter {
    private static final int TIME = 3000;
    private static final int WHAT = 103;

    private SplashContract.View view;
    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            view.intent2Act();
        }
    };

    public SplashPresenter(SplashContract.View view) {
        this.view = view;
    }

    @Override
    public void timingBegin() {
        handler.sendEmptyMessageDelayed(WHAT, TIME);
    }

    @Override
    public void startIntent() {
        handler.removeMessages(WHAT);
        view.intent2Act();
    }
}
