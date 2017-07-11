package com.yd.musicplay.inject.component;

import com.yd.musicplay.inject.module.MusicLocalListModule;
import com.yd.musicplay.ui.fragment.MusicListLocalFragment;

import dagger.Component;

/**
 * Created by DELL on 2017/7/10.
 */

@Component(modules = MusicLocalListModule.class)
public interface MusicLocalListComponent {
    void inject(MusicListLocalFragment fragment);
}
