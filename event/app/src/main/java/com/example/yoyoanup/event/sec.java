package com.example.yoyoanup.event;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sec extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        Bundle bd=getIntent().getExtras();
        String s2=bd.getString("one");
        TextView t2=(TextView)findViewById(R.id.tv2);
        t2.setText(s2);
        Button b2=(Button)findViewById(R.id.bt2);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i2=new Intent(this,MainActivity.class);
        EditText e2=(EditText)findViewById(R.id.et2);
        String sr2=e2.getText().toString();
        i2.putExtra("two",sr2);
        startActivity(i2);

    }
}
