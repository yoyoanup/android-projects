package com.example.yoyoanup.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class city extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        //array adapter
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                        R.array.string_array, android.R.layout.simple_spinner_item);


                adapter.setDropDownViewResource
                        (android.R.layout.simple_spinner_dropdown_item);


                if (spinner != null) {
                    spinner.setAdapter(adapter);

                }
            }



            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {


                String spinner_item = adapterView.getItemAtPosition(pos).toString();

            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(getApplicationContext(),"nothing selected",Toast.LENGTH_LONG).show();

            }

            public void city(View view) {
                Spinner spinnerr = (Spinner) findViewById(R.id.spinner);
                String spinner_item2 =spinnerr.getSelectedItem().toString();


                if(spinner_item2.equalsIgnoreCase("udaipur" ))
                {
                    Intent i1=new Intent(this,udaipurservices.class);

                    startActivity(i1);
                }
                else if(spinner_item2.equalsIgnoreCase("jaipur"))
                {
                    Intent i2=new Intent(this,udaipurservices.class);
                    startActivity(i2);
                }

                else if(spinner_item2.equalsIgnoreCase("chittorgarh"))
                {
                    Intent i3=new Intent(this,udaipurservices.class);
                    startActivity(i3);
                }

                else if(spinner_item2.equalsIgnoreCase("jaisalmer"))
                {
                    Intent i4=new Intent(this,udaipurservices.class);
                    startActivity(i4);
                }

            }
        }









