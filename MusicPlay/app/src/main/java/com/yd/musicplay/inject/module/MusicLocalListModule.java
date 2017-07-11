package com.yd.musicplay.inject.module;

import android.content.Context;

import com.yd.musicplay.ui.fragment.MusicListLocalFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DELL on 2017/7/10.
 */

@Module
public class MusicLocalListModule {

    Context context;
    MusicListLocalFragment musicListLocalFragment;

    public MusicLocalListModule(Context context, MusicListLocalFragment musicListLocalFragment) {
        this.context = context;
        this.musicListLocalFragment = musicListLocalFragment;
    }

    @Provides
    MusicListLocalFragment providesLocalFragment() {
        return musicListLocalFragment;
    }

    @Provides
    Context providescontext() {
        return context;
    }
}
