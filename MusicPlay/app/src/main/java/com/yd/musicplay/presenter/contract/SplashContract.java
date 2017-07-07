package com.yd.musicplay.presenter.contract;

/**
 * Created by DELL on 2017/7/4.
 * 启动页相关接口
 */

public interface SplashContract {
    /**
     * view接口
     */
    interface View {
        void intent2Act();
    }

    /**
     * presenter接口
     */
    interface Presenter {
        void timingBegin();

        void startIntent();
    }
}
