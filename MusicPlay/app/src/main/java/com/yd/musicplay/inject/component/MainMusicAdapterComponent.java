package com.yd.musicplay.inject.component;

import com.yd.musicplay.inject.module.MainMusicAdapterModule;
import com.yd.musicplay.inject.module.MusicPresenterModule;
import com.yd.musicplay.ui.fragment.MainMusicFragment;

import dagger.Component;

/**
 * Created by DELL on 2017/7/5.
 */
@Component(modules = {MainMusicAdapterModule.class, MusicPresenterModule.class})
public interface MainMusicAdapterComponent {
    void inject(MainMusicFragment activity);
}
