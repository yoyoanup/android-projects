package com.example.yoyoanup.event;

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
        Button b1=(Button)findViewById(R.id.bt1);
        b1.setOnClickListener(this);

        Bundle b2=getIntent().getExtras();
        String ss1=b2.getString("two");
        TextView ttv2=(TextView)findViewById(R.id.tv1);
        ttv2.setText(ss1);
    }

    @Override
    public void onClick(View view) {
        Intent i1=new Intent(this,sec.class);
        EditText e1=(EditText)findViewById(R.id.et1);
        String s=e1.getText().toString();
        i1.putExtra("one",s);
        startActivity(i1);

    }
}
