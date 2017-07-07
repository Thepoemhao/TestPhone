package com.yd.testdagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yd.testdagger2.presenter.IFragment;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by DELL on 2017/7/3.
 */

public class TwoFragment extends Fragment implements IFragment.View {

    @BindView(R.id.two_tv)
    TextView twoTv;
    Unbinder unbinder;

    @Inject
    IFragment.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        DaggerOneFragmentConponent.builder().build().inject(this);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void show(String string) {
        twoTv.setText(string);
    }

    public void getData() {
        presenter.getData(getActivity(), this);
    }
}
