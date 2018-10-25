package com.example.user.androidcomponent;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListAdapter;

import com.example.user.androidcomponent.adapter.P007ArrayAdapter;

public class P007ListViewCustomRow extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] activityNames= getResources().getStringArray(R.array.activity_name_P007);
        ListAdapter listAdapter=new P007ArrayAdapter(P007ListViewCustomRow.this,activityNames);
        setListAdapter(listAdapter);
    }
}
