package com.example.user.androidcomponent;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static java.lang.Class.forName;

public class P000Menu extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView= getListView();

        String[] actvityNames=getResources().getStringArray(R.array.activity_names);
        ListAdapter listAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,actvityNames);
        listView.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        try {
            Class className= Class.forName("com.example.user.androidcomponent."+l.getItemAtPosition(position));
            Intent intent=new Intent(this,className);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
