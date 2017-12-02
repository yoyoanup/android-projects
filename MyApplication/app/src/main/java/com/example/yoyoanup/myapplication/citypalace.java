package com.example.yoyoanup.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class citypalace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citypalace);


    }

    public void rest(View view) {
        String st3="near by atm";
            Uri location = Uri.parse("geo:0,0?q=" +st3);
            Intent i2=new Intent(Intent.ACTION_VIEW,location);
            if (i2.resolveActivity(getPackageManager()) != null) {
                startActivity(i2);
            } else {
                Log.d("ImplicitIntents", "cann not resolve");
            }
        }


    public void fuel(View view) {

        String st3="Petrol Pump";
        Uri location = Uri.parse("geo:0,0?q=" +st3);
        Intent i2=new Intent(Intent.ACTION_VIEW,location);
        if (i2.resolveActivity(getPackageManager()) != null) {
            startActivity(i2);
        } else {
            Log.d("ImplicitIntents", "cann not resolve");
        }
    }
}

