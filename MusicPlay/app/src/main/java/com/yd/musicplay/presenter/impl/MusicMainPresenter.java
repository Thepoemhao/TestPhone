package com.yd.musicplay.presenter.impl;

import com.yd.musicplay.presenter.contract.MusicMainContract;

import javax.inject.Inject;

/**
 * Created by DELL on 2017/7/5.
 */

public class MusicMainPresenter implements MusicMainContract.Presenter {
    private MusicMainContract.View view;

    @Inject
    public MusicMainPresenter(MusicMainContract.View view) {
            this.view = view;
    }

    @Override
    public void cardEnvnt(int id) {
        view.card2new(id);
    }

    @Override
    public void songListEnvnt() {
        view.song2new();
    }
}
