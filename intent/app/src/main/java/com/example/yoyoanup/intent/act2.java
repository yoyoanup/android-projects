package com.example.yoyoanup.intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class act2 extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        TextView t1=(TextView)findViewById(R.id.tv2);
        Button b=(Button)findViewById(R.id.butn2);

        Bundle bd=getIntent().getExtras();
        if(bd== null)
        {
            return;
        }
        String msg=bd.getString("first");
        t1.setText(msg);
    }



}
