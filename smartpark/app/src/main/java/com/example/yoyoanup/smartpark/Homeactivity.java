package com.example.yoyoanup.smartpark;

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
    public void Register(View view) {
        Intent registerintent =new Intent(this,registration.class);
        startActivity(registerintent);
    }

    public void skipregister(View view) {
        Intent skip=new Intent(this,skipreg.class);
        startActivity(skip);
    }
}
