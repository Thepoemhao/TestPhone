package com.yd.musicplay.presenter.impl;

import android.content.Context;

import com.yd.musicplay.presenter.contract.MusicLocalListContract;

/**
 * Created by DELL on 2017/7/6.
 * 本地音乐presenter层
 */

public class MusicLocalListPresenter implements MusicLocalListContract.Presenter {
    //设置View对象把得到的音乐传给view
    MusicLocalListContract.View view;
    Context context;

    public MusicLocalListPresenter(MusicLocalListContract.View view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public void getLocalMisic() {
//        view.setLocalMusic();
    }
}
