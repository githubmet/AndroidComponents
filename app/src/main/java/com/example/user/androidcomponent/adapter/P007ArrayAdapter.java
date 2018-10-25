package com.example.user.androidcomponent.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.user.androidcomponent.R;

public class P007ArrayAdapter extends ArrayAdapter<String> {

    Context context;
    String[] resource;
    public P007ArrayAdapter(Context context, String[] resource) {
        super(context, R.layout.p007_custom_row ,resource);
        this.context=context;
        this.resource=resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view= layoutInflater.inflate(R.layout.p007_custom_row,parent,false);


        TextView textViewLeftP007= view.findViewById(R.id.textViewLeftP007);
        TextView textViewRightP007= view.findViewById(R.id.textViewRightP007);
        textViewLeftP007.setText(resource[position]);
        textViewRightP007.setText(resource[position]);

        return view;//super.getView(position, convertView, parent);

    }
}
