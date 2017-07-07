package com.yd.testdagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DELL on 2017/7/3.
 */

@Module
public class FragmentModule {
    @Provides
    OneFragment getOneFragment() {
        return new OneFragment();
    }

    @Provides
    TwoFragment getTwoFragment() {
        return new TwoFragment();
    }

}
