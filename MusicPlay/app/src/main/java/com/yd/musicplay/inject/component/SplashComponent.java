package com.yd.musicplay.inject.component;

import com.yd.musicplay.inject.module.SplashModule;
import com.yd.musicplay.ui.activity.SplashActivity;

import dagger.Component;

/**
 * Created by DELL on 2017/7/4.
 */
@Component(modules = SplashModule.class)
public interface SplashComponent {
    void inject(SplashActivity activity);
}
