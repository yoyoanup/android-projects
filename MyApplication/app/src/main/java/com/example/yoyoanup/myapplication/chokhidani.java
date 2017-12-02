package com.example.yoyoanup.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class chokhidani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chokhidani);
    }

    public void viewmenu(View view) {


            Intent i =new Intent(this,chokhidanimenu.class);
            startActivity(i);

    }
}
