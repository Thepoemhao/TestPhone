package com.yd.testdagger2;

import android.content.Context;

import dagger.Component;

/**
 * Created by DELL on 2017/7/3.
 */

@Component
public interface SPComponent {

    void inject(Context activity);
}
