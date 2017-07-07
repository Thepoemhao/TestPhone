package com.yd.musicplay.inject.module;

import com.yd.musicplay.ui.fragment.MainMusicFragment;
import com.yd.musicplay.ui.fragment.MainMvFragment;
import com.yd.musicplay.ui.fragment.MainVideoFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DELL on 2017/7/5.
 */
@Module
public class MainModule {
    @Provides
    MainMusicFragment providesMainFragment() {
        return new MainMusicFragment();
    }

    @Provides
    MainVideoFragment providesMainVideoFragment() {
        return new MainVideoFragment();
    }

    @Provides
    MainMvFragment providesMainLiveFragment() {
        return new MainMvFragment();
    }
}
