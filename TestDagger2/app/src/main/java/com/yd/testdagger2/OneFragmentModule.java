package com.yd.testdagger2;

import android.content.Context;

import com.yd.testdagger2.presenter.IFragment;
import com.yd.testdagger2.presenter.PresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DELL on 2017/7/3.
 */
//获取参数的方法
@Module
public class OneFragmentModule {
    private IFragment.Presenter presenter;

    public OneFragmentModule(Context context) {
        presenter = new PresenterImpl();
    }

    @Provides
    IFragment.Presenter getContext() {

        return presenter;
    }
}
