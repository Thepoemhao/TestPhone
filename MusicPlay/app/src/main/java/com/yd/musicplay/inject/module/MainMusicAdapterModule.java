package com.yd.musicplay.inject.module;

import android.content.Context;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DELL on 2017/7/5.
 */
@Module
public class MainMusicAdapterModule {
    Context context;
    ArrayList<String> list;


    public MainMusicAdapterModule(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }



    @Provides
    Context providesContext() {
        return context;
    }

    @Provides
    ArrayList<String> providesArrayList() {
        return list;
    }
}
