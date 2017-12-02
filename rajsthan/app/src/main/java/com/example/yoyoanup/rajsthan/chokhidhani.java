package com.example.yoyoanup.rajsthan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class chokhidhani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chokhidhani);
    }

    public void viewmenu(View view) {
        Intent i =new Intent(this,chokhidhanimenu.class);
        startActivity(i);
    }
}
