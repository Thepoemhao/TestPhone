package com.yd.testdagger2.presenter;

import android.content.Context;

import com.yd.testdagger2.sp.SPUtils;

import javax.inject.Inject;

/**
 * Created by DELL on 2017/7/3.
 * 定义存取显示数据的方法类（mvp ——P层实现类类）
 */

public class PresenterImpl implements IFragment.Presenter {

    //因为要注入，不能写private
    @Inject
    SPUtils spUtils;

    @Inject
    public PresenterImpl() {
        this.spUtils = new SPUtils();
    }

    @Override
    public void saveData(Context context, String string) {
        spUtils.save(context, string);
    }

    @Override
    public void getData(Context context, IFragment.View view) {
        view.show(spUtils.getUser(context));
    }
}
