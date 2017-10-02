package com.example.yoyoanup.smarpark;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static  int SPLASH_TIME_OUT=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {

                Intent homeintent=new Intent(MainActivity.this,Homeactivity.class);
                startActivity(homeintent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
