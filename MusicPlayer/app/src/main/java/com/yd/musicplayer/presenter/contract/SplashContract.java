package com.yd.musicplayer.presenter.contract;

/**
 * Created by DELL on 2017/6/28.
 */

public interface SplashContract {
    /*
     * View 接口
     */
    interface View{
        //意图跳转方法
        void intent2MainActivity();
    }

    /**
     * presenter 接口
     */
    interface presenter{
        //计时方法
        void timingBegin();
        //开启意图方法
        void startIntent();
    }
}
