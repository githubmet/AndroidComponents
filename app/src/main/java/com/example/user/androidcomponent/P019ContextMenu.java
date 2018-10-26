package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class P019ContextMenu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p019_contextmenu);


        TextView textViewP019= findViewById(R.id.textViewP019);
        registerForContextMenu(textViewP019);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        menu.add(menu.NONE,Menu.FIRST,0,"Hello");
        menu.add(menu.NONE,Menu.FIRST+1,1,"new");
        menu.add(menu.NONE,Menu.FIRST+2,2,"world");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case Menu.FIRST:
                Toast.makeText(this,"First One",Toast.LENGTH_SHORT).show();
                return true;
            case Menu.FIRST+1:
                Toast.makeText(this,"Second One",Toast.LENGTH_SHORT).show();
                return true;
            case Menu.FIRST+2:
                Toast.makeText(this,"Third One",Toast.LENGTH_SHORT).show();
                return true;
                default:
                    return super.onContextItemSelected(item);
        }


    }
}
