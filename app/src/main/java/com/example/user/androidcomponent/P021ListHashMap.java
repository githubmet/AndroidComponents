package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P021ListHashMap extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p021_list_hashmap);
    }

    public void onClickMtdP021(View view) {

        List list=new ArrayList();
        list.add("Hikmet");
        list.add(21);
        list.add('A');
        //You have to type cast to show the toast message.
        Toast.makeText(this, list.get(2).toString(),Toast.LENGTH_SHORT).show();
    }

    public void onClickMtd2P021(View view) {

        List<String> listGeneric=new ArrayList<>();
        listGeneric.add("Hikmet");
        listGeneric.add("Kerem");
        listGeneric.add("Osman");

        //You don't need to type cast
        Toast.makeText(this, listGeneric.get(1),Toast.LENGTH_SHORT).show();
    }

    public void onClickMtd3P021(View view) {

        Map<String,Integer> map=new HashMap<>();
        map.put("key",1000);
        map.put("key2",2000);
        map.put("key3",3000);
                                            //map.get(2)  wrong!
        Toast.makeText(this,  map.get("key2") .toString(),Toast.LENGTH_SHORT).show();
    }
}
