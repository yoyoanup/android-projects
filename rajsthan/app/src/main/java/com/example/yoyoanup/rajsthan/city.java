package com.example.yoyoanup.rajsthan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class city extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);


        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create ArrayAdapter using the string array and default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.string_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);

        }
    }



    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {

        //String spinner_item =spinner.getSelectedItem().toString();
        String spinner_item = adapterView.getItemAtPosition(pos).toString();
        //Toast.makeText(getApplicationContext(),spinner_item+" "+"selected",Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(getApplicationContext(),"nothing selected",Toast.LENGTH_LONG).show();

    }

    public void city(View view) {
        Spinner spinnerr = (Spinner) findViewById(R.id.spinner);
        String spinner_item2 =spinnerr.getSelectedItem().toString();


        if(spinner_item2.equalsIgnoreCase("chittorgarh" ))
        {
            //Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_SHORT).show();
            Intent i1=new Intent(this,chittorgarhservices.class);

            startActivity(i1);
        }
        else if(spinner_item2.equalsIgnoreCase("jaipur"))
        {
            //Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_SHORT).show();
            Intent i2=new Intent(this,chittorgarhservices.class);
            startActivity(i2);
        }

        else if(spinner_item2.equalsIgnoreCase("udaipur"))
        {
            // Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_SHORT).show();
            Intent i3=new Intent(this,chittorgarhservices.class);
            startActivity(i3);
        }

        else if(spinner_item2.equalsIgnoreCase("jaisalmer"))
        {
            //Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_SHORT).show();
            Intent i4=new Intent(this,chittorgarhservices.class);
            startActivity(i4);
        }

    }
    }

