package com.example.user.androidcomponent.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.user.androidcomponent.R;
import com.example.user.androidcomponent.communication.P035Interface;

public class P035FragmentTop extends Fragment implements View.OnClickListener {

    EditText editTextP035;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.p035_fragment_top,container,false);

        return view; //super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.buttonP035).setOnClickListener(this);
        editTextP035= view.findViewById(R.id.editTextP035);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttonP035){
            P035Interface p035Interface= (P035Interface)getActivity();
            p035Interface.setDataToFragmentBottom(editTextP035.getText().toString());
        }
    }
}
