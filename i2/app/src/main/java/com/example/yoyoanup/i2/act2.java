package com.example.yoyoanup.i2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class act2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        Button b2=(Button)findViewById(R.id.reply);

        EditText e2=(EditText)findViewById(R.id.name2);

        Bundle bd=getIntent().getExtras();

        String s2=bd.getString("firt");
        e2.setText(s2);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        EditText e2=(EditText)findViewById(R.id.name2);
        String s22=e2.getText().toString();
        Intent i=new Intent(this,MainActivity.class);
        i.putExtra("second",s22);
        startActivity(i);

    }
}
