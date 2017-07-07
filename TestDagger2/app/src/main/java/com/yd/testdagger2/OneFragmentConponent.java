package com.yd.testdagger2;

import dagger.Component;

/**
 * Created by DELL on 2017/7/3.
 */

@Component(modules = OneFragmentModule.class)
public interface OneFragmentConponent {
    void inject(OneFragment fragment);

    void inject(TwoFragment fragment);

}
