package com.example.asus.hujayapps;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by super on 7/19/2018.
 */

public class MateriFragment extends Fragment {
    @LayoutRes int resId;

    public MateriFragment() {

    }

    @SuppressLint("ValidFragment")
    public MateriFragment(int resId) {
        this.resId = resId;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(resId, container, false);
    }
}
