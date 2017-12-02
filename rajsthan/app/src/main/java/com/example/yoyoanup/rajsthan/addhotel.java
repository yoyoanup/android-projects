package com.example.yoyoanup.rajsthan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class addhotel extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addhotel);

    }

    public void add(View view) {
        EditText e1=(EditText)findViewById(R.id.editText);
        String s=e1.getText().toString();
        Intent i=new Intent(this,chittorgarhhotels.class);
        i.putExtra("one",s);
        startActivity(i);
    }
}
