package com.yd.testdagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.yd.testdagger2.presenter.IFragment;
import com.yd.testdagger2.userbean.UserBean;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by DELL on 2017/7/3.
 */

public class OneFragment extends Fragment {

    @BindView(R.id.one_name)
    EditText oneName;
    @BindView(R.id.one_age)
    EditText oneAge;
    @BindView(R.id.one_sex)
    EditText oneSex;
    @BindView(R.id.button)
    Button button;
    Unbinder unbinder;

    @Inject
    IFragment.Presenter presenter;

    @Inject
    UserBean userBean;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        unbinder = ButterKnife.bind(this, view);

        DaggerOneFragmentConponent.builder().build().inject(this);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.button)
    public void onViewClicked() {

        userBean.setName(oneName.getText().toString());
        userBean.setAge(oneAge.getText().toString());
        userBean.setSex(oneSex.getText().toString());

        presenter.saveData(getActivity(), userBean.toString());

        ((MainActivity) getActivity()).getDataByTwo();

    }
}
