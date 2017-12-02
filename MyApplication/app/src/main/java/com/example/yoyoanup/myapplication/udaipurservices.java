package com.example.yoyoanup.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class udaipurservices extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udaipurservices);
        Button b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(this);
        Button b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
        Button b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);
        Button b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(this);
        Button b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(this);
        Button b6=(Button)findViewById(R.id.button7);
        b6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.button1:
                Intent i=new Intent(this,udaipurtradition.class);
                startActivity(i);
                break;

            case R.id.button2:
                Intent i2=new Intent(this,udaipurmonuments.class);
                startActivity(i2);
                break;

            case R.id.button3:
                Intent i3=new Intent(this,udaipurresturent.class);
                startActivity(i3);
                break;

            case R.id.button4:
                Intent i4=new Intent(this,udaipurhotel.class);
                startActivity(i4);
                break;

            case R.id.button5:
                Intent i5=new Intent(this,udaipurtourguide.class);
                startActivity(i5);
                break;

            case R.id.button7:
                Intent i7=new Intent(this,udaipurtransport.class);
                startActivity(i7);
                break;
            default:
                break;

        }

    }
}
