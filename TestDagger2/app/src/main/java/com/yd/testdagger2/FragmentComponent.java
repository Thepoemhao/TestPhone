package com.yd.testdagger2;

import dagger.Component;

/**
 * Created by DELL on 2017/7/3.
 */

@Component(modules = FragmentModule.class)
public interface FragmentComponent {

    void inject(MainActivity activity);
}
