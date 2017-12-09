package com.example.yoyoanup.dtech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Homeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
    }

    public void user(View view) {
        Intent i=new Intent(this,userlogin.class);
        startActivity(i);
    }

    public void doctor(View view) {
        Intent i1=new Intent(this,doctorlogin.class);
    }
}
