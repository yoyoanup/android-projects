package com.example.yoyoanup.implicit;

import android.content.Intent;
import android.net.Uri;
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

        EditText e1=(EditText)findViewById(R.id.et);
        Button bt=(Button)findViewById(R.id.btn);
        Button bt2=(Button)findViewById(R.id.btn2);

        bt.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        EditText e1=(EditText)findViewById(R.id.et);
        String st=e1.getText().toString();
        Uri site = Uri.parse(st);
        Intent i = new Intent(Intent.ACTION_VIEW,site);
        startActivity(i);

    }

    public void map(View view) {
        EditText e2=(EditText)findViewById(R.id.et2);

        String st2=e2.getText().toString();

        Uri location = Uri.parse("geo:0,0?q=" +st2);
        Intent i2=new Intent(Intent.ACTION_VIEW,location);
        startActivity(i2);

    }
}
