package com.yd.musicplay.inject.component;

import com.yd.musicplay.inject.module.MainModule;
import com.yd.musicplay.ui.fragment.MainFragment;

import dagger.Component;

/**
 * Created by DELL on 2017/7/5.
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainFragment fragment);
}
