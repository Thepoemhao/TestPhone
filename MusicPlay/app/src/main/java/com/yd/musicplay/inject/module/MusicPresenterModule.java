package com.yd.musicplay.inject.module;

import com.yd.musicplay.presenter.contract.MusicMainContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DELL on 2017/7/6.
 */
@Module
public class MusicPresenterModule {
    MusicMainContract.View view;

    public MusicPresenterModule(MusicMainContract.View view) {
        this.view = view;
    }
    @Provides
    MusicMainContract.View getView(){
        return view;
    }
}
