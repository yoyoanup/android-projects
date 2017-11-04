package com.example.yoyoanup.smartpark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class delhi extends AppCompatActivity {
//sdhaskdlk
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);

        CheckBox c1=(CheckBox)findViewById(R.id.north);
        CheckBox c2=(CheckBox)findViewById(R.id.south);
        CheckBox c3=(CheckBox)findViewById(R.id.east);
        CheckBox c4=(CheckBox)findViewById(R.id.west);


    }

    public void ok(View view) {
        CheckBox c1=(CheckBox)findViewById(R.id.north);
        CheckBox c2=(CheckBox)findViewById(R.id.south);
        CheckBox c3=(CheckBox)findViewById(R.id.east);
        CheckBox c4=(CheckBox)findViewById(R.id.west);
        if(c1.isChecked())
        {
            String c11=c1.getText().toString();
            if(c11.equalsIgnoreCase("north")) {
                // Toast.makeText(getApplicationContext(),c11,Toast.LENGTH_SHORT).show();
                Intent i3 = new Intent(this, delhinorthloc.class);
                startActivity(i3);
            }
        }

        else if(c2.isChecked())
        {
            String c21=c2.getText().toString();
            if(c21.equalsIgnoreCase("south")) {
                //Toast.makeText(getApplicationContext(),c21,Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(this, delhisouthloc.class);
                startActivity(i1);
            }
        }
        else if(c3.isChecked())
        {
            String c31=c3.getText().toString();
            if(c31.equalsIgnoreCase("east")) {
                //Toast.makeText(getApplicationContext(),c31,Toast.LENGTH_SHORT).show();
                Intent i2 = new Intent(this, eastdelhi.class);
                startActivity(i2);
            }
        }
        else if(c4.isChecked())
        {
            String c41=c4.getText().toString();
            if(c41.equalsIgnoreCase("west")) {
                //Toast.makeText(getApplicationContext(),c41,Toast.LENGTH_SHORT).show();
                Intent i4 = new Intent(this, delhiwestloc.class);
                startActivity(i4);
            }
        }
    }
}
