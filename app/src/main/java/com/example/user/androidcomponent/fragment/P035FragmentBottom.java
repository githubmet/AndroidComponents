package com.example.user.androidcomponent.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.androidcomponent.R;

public class P035FragmentBottom extends Fragment {
    TextView textViewP035;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.p035_fragment_bottom,container,false);
        return view; //super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textViewP035= view.findViewById(R.id.textViewP035);
    }
    public void setDataToTextViewMtd(String data){
        textViewP035.setText(data);
    }
}
