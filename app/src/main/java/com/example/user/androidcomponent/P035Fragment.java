package com.example.user.androidcomponent;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import com.example.user.androidcomponent.communication.P035Interface;
import com.example.user.androidcomponent.fragment.P035FragmentBottom;

public class P035Fragment extends Activity implements P035Interface {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p035_fragment_layout);
    }

    @Override
    public void setDataToFragmentBottom(String data) {
        Fragment fragmentBottomP035= (P035FragmentBottom)getFragmentManager()
                .findFragmentById(R.id.fragmentBottomP035);
        ((P035FragmentBottom) fragmentBottomP035).setDataToTextViewMtd(data);
    }
}
