package com.yd.musicplay.presenter.contract;

/**
 * Created by DELL on 2017/7/5.
 */

public interface MusicMainContract {
    interface View {

        void card2new(int id);

        void song2new();
    }

    interface Presenter {
        //按钮点击方法
        void cardEnvnt(int id);

        void songListEnvnt();

    }
}
