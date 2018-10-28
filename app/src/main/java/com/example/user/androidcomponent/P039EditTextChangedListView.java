package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class P039EditTextChangedListView extends Activity implements TextWatcher {

    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p039_edittextchenged_listview);

        EditText editTextP039= findViewById(R.id.editTextP039);
        editTextP039.addTextChangedListener(this);

        String[] string_array_p039= getResources().getStringArray(R.array.string_array_p039);
        ListView listViewP039= findViewById(R.id.listViewP039);
        arrayAdapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1,string_array_p039);
        listViewP039.setAdapter(arrayAdapter);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        arrayAdapter.getFilter().filter(charSequence);
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
