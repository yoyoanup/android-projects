package com.example.yoyoanup.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1=(TextView)findViewById(R.id.tv1);
        Button b1=(Button)findViewById(R.id.btn1);
        b1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        Intent i=new Intent(this,act2.class);
        EditText e=(EditText)findViewById(R.id.et);
        String name=e.getText().toString();

        i.putExtra("first",name);

       startActivity(i);

    }


}
