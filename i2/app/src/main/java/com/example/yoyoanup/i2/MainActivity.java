package com.example.yoyoanup.i2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1=(EditText)findViewById(R.id.name);

        Button b1=(Button)findViewById(R.id.send);
        b1.setOnClickListener(this);

        Bundle bd=getIntent().getExtras();

        String s2=bd.getString("second");
        e1.setText(s2);
    }

    @Override
    public void onClick(View view) {

        EditText e1=(EditText)findViewById(R.id.name);
        String s=e1.getText().toString();
        Intent i=new Intent(this,act2.class);
        i.putExtra("firt",s);
        startActivity(i);
    }
}
