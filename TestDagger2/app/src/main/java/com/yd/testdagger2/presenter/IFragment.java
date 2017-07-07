package com.yd.testdagger2.presenter;

import android.content.Context;

/**
 * Created by DELL on 2017/7/3.
 */
//定义存取显示数据的方法接口（mvp ——P层接口）
public interface IFragment {
    interface View {
        void show(String string);
    }

    interface Presenter {
        void saveData(Context context, String string);

        void getData(Context context, IFragment.View view);
    }
}
