package com.yd.musicplay.presenter.contract;

import com.yd.musicplay.MusicBean;

import java.util.ArrayList;

/**
 * Created by DELL on 2017/7/6.
 * 获取本地音乐接口
 */

public interface MusicLocalListContract {
    interface View {
        void setLocalMusic(ArrayList<MusicBean> list);
    }

    interface Presenter {
        //得到本地音乐方法
        void getLocalMisic();
    }
}
