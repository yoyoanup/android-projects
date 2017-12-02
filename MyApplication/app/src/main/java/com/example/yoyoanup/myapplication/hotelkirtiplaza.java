package com.example.yoyoanup.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class hotelkirtiplaza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotelkirtiplaza);
    }

    public void book(View view) {
        Button b1=(Button)findViewById(R.id.button);
        Intent i=new Intent(this,kirtiplazabooking.class);
        startActivity(i);
    }
}
