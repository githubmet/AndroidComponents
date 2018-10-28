package com.example.user.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class P013TabHostTabSpec extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p013_tabhost_tabspec);

        TabHost tabHostP013= (TabHost) findViewById(R.id.tabHostP013);
        tabHostP013.setup();

        TabHost.TabSpec tabSpec=tabHostP013.newTabSpec("FIRST");
        tabSpec.setContent(R.id.linearLayoutTabP013);
        tabSpec.setIndicator("One");

        TabHost.TabSpec tabSpec2=tabHostP013.newTabSpec("SECOND");
        tabSpec2.setContent(R.id.linearLayoutTab2P013);
        tabSpec2.setIndicator("Two");

        TabHost.TabSpec tabSpec3=tabHostP013.newTabSpec("THIRD");
        tabSpec3.setContent(R.id.linearLayoutTab3P013);
        tabSpec3.setIndicator("Three");

        tabHostP013.addTab(tabSpec);
        tabHostP013.addTab(tabSpec2);
        tabHostP013.addTab(tabSpec3);
    }



}
