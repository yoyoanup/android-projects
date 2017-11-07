package com.example.yoyoanup.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button) findViewById(R.id.add);
        Button b2=(Button) findViewById(R.id.subs);
        Button b3=(Button) findViewById(R.id.mul);
        Button b4=(Button) findViewById(R.id.dev);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        EditText e1=(EditText)findViewById(R.id.num1);
        EditText e2=(EditText)findViewById(R.id.num2);

        int a,b,c;
        a=Integer.parseInt(e1.getText().toString());
        b=Integer.parseInt(e2.getText().toString());
        // c=a+b;
        // Toast.makeText(getApplicationContext(), String.valueOf(c), Toast.LENGTH_LONG).show();
        switch (view.getId())
        {
            case R.id.add:
                c=a+b;
                Toast.makeText(getApplicationContext(), String.valueOf(c), Toast.LENGTH_LONG).show();
                break;

            case R.id.subs:
                c=a-b;
                Toast.makeText(getApplicationContext(), String.valueOf(c), Toast.LENGTH_LONG).show();
                break;

            case R.id.mul:
                c=a*b;
                Toast.makeText(getApplicationContext(), String.valueOf(c), Toast.LENGTH_LONG).show();
                break;

            case R.id.dev:
                c=a/b;
                Toast.makeText(getApplicationContext(), String.valueOf(c), Toast.LENGTH_LONG).show();
                break;




        }




    }
}