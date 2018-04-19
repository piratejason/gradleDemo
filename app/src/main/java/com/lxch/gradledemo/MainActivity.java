package com.lxch.gradledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        if (BuildConfig.DEBUG) {
            Log.e("log", BuildConfig.DEBUG + "");
        }
        Log.e("url", BuildConfig.appUrl + "");
        tv1.setText(BuildConfig.APPLICATION_ID);
        tv2.setText(BuildConfig.VERSION_NAME);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
