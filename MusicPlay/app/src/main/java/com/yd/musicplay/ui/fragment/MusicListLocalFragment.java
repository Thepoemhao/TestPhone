package com.yd.musicplay.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yd.musicplay.R;
import com.yd.musicplay.inject.component.DaggerMusicLocalListComponent;
import com.yd.musicplay.inject.module.MusicLocalListModule;
import com.yd.musicplay.presenter.contract.MusicLocalListContract;
import com.yd.musicplay.presenter.impl.MusicLocalListPresenter;
import com.yd.musicplay.ui.adapter.MusicListAdapter;
import com.yd.musicplay.utils.MusicBean;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by DELL on 2017/7/6.
 * 本地音乐列表
 */

public class MusicListLocalFragment extends BaseFragment implements MusicLocalListContract.View {
    @BindView(R.id.music_local_list_title)
    TextView musicLocalListTitle;
    @BindView(R.id.music_local_list_list)
    RecyclerView musicLocalListList;
    Unbinder unbinder;
    ArrayList<MusicBean> list = new ArrayList<>();

    MusicListAdapter musicListAdapter;
    @Inject
    MusicLocalListPresenter musicLocalListPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_local_music_list, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DaggerMusicLocalListComponent
                .builder()
                .musicLocalListModule(new MusicLocalListModule(getContext(), this))
                .build()
                .inject(this);
        musicLocalListPresenter.getLocalMisic();

    }

    //设置本地音乐列表
    @Override
    public void setLocalMusic(ArrayList<MusicBean> list) {

        setadapter();
        this.list.clear();
        this.list.addAll(list);
        musicListAdapter.notifyDataSetChanged();

    }

    private void setadapter() {
        musicListAdapter = new MusicListAdapter(getContext(), list);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        musicLocalListList.setLayoutManager(llm);
        musicLocalListList.setAdapter(musicListAdapter);
    }
}
