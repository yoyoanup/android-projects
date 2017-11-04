package com.example.yoyoanup.smartpark;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class confirmbooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmbooking);
        TextView t1=(TextView)findViewById(R.id.textView);
        Bundle bd=getIntent().getExtras();
        if(bd== null)
        {
            return;
        }
        String msg=bd.getString("first");
        t1.setText(msg);
    }

    public void feedback(View view) {
    }
}
