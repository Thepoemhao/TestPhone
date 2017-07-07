package com.yd.testdagger2.sp;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * Created by DELL on 2017/7/3.
 */

public class SPUtils {
    private String name = "dagger7_3";
    private String key = "user";

    @Inject
    public SPUtils() {

    }

    public void save(Context context, String string) {
        SharedPreferences sp = context.getSharedPreferences(name, Context.MODE_PRIVATE);

        sp.edit().putString(key, string).commit();

    }

    public String getUser(Context context) {
        return context.getSharedPreferences(name, Context.MODE_PRIVATE).getString(key, "");
    }
}
