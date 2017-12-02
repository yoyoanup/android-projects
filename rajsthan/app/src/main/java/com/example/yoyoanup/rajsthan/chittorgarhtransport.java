package com.example.yoyoanup.rajsthan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class chittorgarhtransport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittorgarhtransport);


    }

    public void nearby(View view) {
        EditText e1=(EditText)findViewById(R.id.editText);
        String st2=e1.getText().toString();
        Uri location = Uri.parse("geo:0,0?q=" +st2);
        Intent i2=new Intent(Intent.ACTION_VIEW,location);
        if (i2.resolveActivity(getPackageManager()) != null) {
            startActivity(i2);
        } else {
            Log.d("ImplicitIntents", "cann not resolve");
        }
    }

    public void atm(View view) {
        String st3="near by atm";
        Uri location = Uri.parse("geo:0,0?q=" +st3);
        Intent i2=new Intent(Intent.ACTION_VIEW,location);
        if (i2.resolveActivity(getPackageManager()) != null) {
            startActivity(i2);
        } else {
            Log.d("ImplicitIntents", "cann not resolve");
        }
    }
}
