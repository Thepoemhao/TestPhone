package com.yd.musicplay.presenter.impl;

import android.content.Context;

import com.yd.musicplay.presenter.contract.MusicLocalListContract;
import com.yd.musicplay.ui.fragment.MusicListLocalFragment;
import com.yd.musicplay.utils.FileUtils;

import javax.inject.Inject;

/**
 * Created by DELL on 2017/7/6.
 * 本地音乐presenter层
 */

public class MusicLocalListPresenter implements MusicLocalListContract.Presenter {
    //    //设置View对象把得到的音乐传给view
//    MusicLocalListContract.View view;
    MusicListLocalFragment musicListLocalFragment;
    Context context;

    @Inject
    public MusicLocalListPresenter(MusicListLocalFragment musicListLocalFragment, Context context) {
        this.musicListLocalFragment = musicListLocalFragment;
        this.context = context;
    }

    @Override
    public void getLocalMisic() {
        musicListLocalFragment.setLocalMusic(FileUtils.getMusicFiles(context));
    }
}
