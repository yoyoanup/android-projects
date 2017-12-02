package com.example.yoyoanup.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class udaipurtradition extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udaipurtradition);

        String [] places={"Festivals","Cuisines","Handicrafts"};



        ListAdapter myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,places);


        ListView mylistview=(ListView)findViewById(R.id.listview);



        mylistview.setAdapter(myadapter);

        mylistview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                        String place=String.valueOf(adapterView.getItemAtPosition(position));
                        Toast.makeText(getApplicationContext(), place, Toast.LENGTH_SHORT).show();
                        if(place.equalsIgnoreCase("Festivals"))
                        {
                            Intent i=new Intent(getApplicationContext(),udfest.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("cuisines"))
                        {
                            Intent i=new Intent(getApplicationContext(),udcuisines.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("handicrafts"))
                        {
                            Intent i=new Intent(getApplicationContext(),udhandi.class);
                            startActivity(i);
                        }


                    }
                }
        );



    }
}
