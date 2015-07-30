package com.logoocc.fragmentanimation;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by samchen on 7/30/15.
 */
public class FrangmentB extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       return inflater.inflate(R.layout.fragment_b, container, false);
    }
}
