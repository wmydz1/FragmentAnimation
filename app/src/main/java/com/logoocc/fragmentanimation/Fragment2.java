package com.logoocc.fragmentanimation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by samchen on 7/30/15.
 */
public class Fragment2 extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (view ==null){
            view =inflater.inflate(R.layout.fragment2,null);
        }
        return  view;
    }
}
