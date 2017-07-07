package com.yd.musicplay.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.yd.musicplay.MainActivity;
import com.yd.musicplay.R;
import com.yd.musicplay.inject.component.DaggerMainMusicAdapterComponent;
import com.yd.musicplay.inject.module.MainMusicAdapterModule;
import com.yd.musicplay.inject.module.MusicPresenterModule;
import com.yd.musicplay.presenter.contract.MusicMainContract;
import com.yd.musicplay.presenter.impl.MusicMainPresenter;
import com.yd.musicplay.ui.adapter.SongListAdapter;
import com.yd.musicplay.view.ScrollRecyclerLayoutManager;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by DELL on 2017/7/4.
 */

public class MainMusicFragment extends BaseFragment implements MusicMainContract.View {


    @BindView(R.id.fragment_music_ib_local)
    ImageView fragmentMusicIbLocal;
    @BindView(R.id.fragment_music_ib_remote)
    ImageView fragmentMusicIbRemote;
    @BindView(R.id.fragment_music_ib_download)
    ImageView fragmentMusicIbDownload;
    @BindView(R.id.fragment_music_ib_lately)
    ImageView fragmentMusicIbLately;
    @BindView(R.id.fragment_music_ib_like)
    ImageView fragmentMusicIbLike;
    @BindView(R.id.fragment_music_ib_recommend)
    ImageView fragmentMusicIbRecommend;
    @BindView(R.id.fragment_music_main_list)
    RecyclerView recyclerView;
    Unbinder unbinder;

    @Inject
    SongListAdapter songListAdapter;
    @Inject
    MusicMainPresenter presenter;

    ArrayList<String> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music_main, container, false);
        //绑定当前页面根布局
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list = getList();
        DaggerMainMusicAdapterComponent
                .builder()
                .mainMusicAdapterModule(new MainMusicAdapterModule(getActivity(), list))
                .musicPresenterModule(new MusicPresenterModule(this))
                .build()
                .inject(this);

        setListView();
    }

    private void setListView() {
        recyclerView.setAdapter(songListAdapter);
        recyclerView.setLayoutManager(new ScrollRecyclerLayoutManager(getActivity()));
        recyclerView.setNestedScrollingEnabled(false);
    }

    @NonNull
    private ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("歌单1");
        list.add("歌单2");
        list.add("歌单3");
        list.add("歌单4");
        list.add("歌单5");
        list.add("歌单6");
        list.add("歌单7");
        list.add("歌单8");
        list.add("歌单9");
        list.add("歌单10");
        list.add("歌单11");
        list.add("歌单12");
        list.add("歌单13");
        list.add("歌单14");
        list.add("歌单15");
        list.add("歌单16");
        list.add("歌单17");
        list.add("歌单18");
        list.add("歌单19");
        list.add("歌单20");
        return list;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //解除绑定当前页面根布局  fragment中需要调用此方法
        unbinder.unbind();
    }


    @OnClick({R.id.fragment_music_ib_local, R.id.fragment_music_ib_remote, R.id.fragment_music_ib_download, R.id.fragment_music_ib_lately, R.id.fragment_music_ib_like, R.id.fragment_music_ib_recommend, R.id.fragment_music_main_list})

    public void onViewClicked(View view) {

        switch (view.getId()) {
            case R.id.fragment_music_ib_local:
                ((MainActivity) getParentFragment().getActivity()).intnet2local();
                break;
            case R.id.fragment_music_ib_remote:
                break;
            case R.id.fragment_music_ib_download:
                break;
            case R.id.fragment_music_ib_lately:
                break;
            case R.id.fragment_music_ib_like:
                break;
            case R.id.fragment_music_ib_recommend:
                break;

        }
    }

    @Override
    public void card2new(int id) {

    }

    @Override
    public void song2new() {

    }
}
