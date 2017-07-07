package com.yd.musicplay.inject.module;

import com.yd.musicplay.presenter.contract.SplashContract;
import com.yd.musicplay.presenter.impl.SplashPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DELL on 2017/7/4.
 */

@Module
public class SplashModule {
    SplashContract.Presenter splashPresenter;

    public SplashModule(SplashContract.View activity) {
        this.splashPresenter = new SplashPresenter(activity);
    }

    @Provides
    @Singleton
    SplashContract.Presenter providesMainPresenter() {
        return splashPresenter;
    }
}
