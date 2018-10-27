package com.example.user.androidcomponent;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class P027AsyncTaskClass extends Activity {
    TextView textViewP027;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p027_asynctask_class);

        textViewP027= findViewById(R.id.textViewP027);

    }

    public void onClickMtdP027(View view) {
        new AsyncTaskClass().execute("params");
    }


    public class AsyncTaskClass extends AsyncTask<String, String ,String>{
        @Override
        protected String doInBackground(String... strings) {
            try {
                Thread.sleep(2000);
                onProgressUpdate(getString(R.string.first_2000));
                Thread.sleep(2000);
                onProgressUpdate(getString(R.string.second_2000));
                Thread.sleep(2000);
                onProgressUpdate(getString(R.string.third_2000));
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "mission is completed";
        }

        @Override
        protected void onPreExecute() {
            textViewP027.setText(getResources().getString(R.string.text2));
            super.onPreExecute();
        }

        @Override
        protected void onProgressUpdate(String... values) {
            textViewP027.setText(values[0]);
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            textViewP027.setText(s);
        }
    }
}
