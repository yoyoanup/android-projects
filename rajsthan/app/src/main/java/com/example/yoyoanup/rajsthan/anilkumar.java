package com.example.yoyoanup.rajsthan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class anilkumar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anilkumar);
    }

    public void book(View view) {
        Intent i=new Intent(this,bookguide.class);
        startActivity(i);
    }
}
