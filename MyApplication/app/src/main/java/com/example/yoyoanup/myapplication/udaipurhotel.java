package com.example.yoyoanup.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class udaipurhotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udaipurhotel);

        String [] places={"Hotel Kirti Plaza","Hotel Meera","Hotel Chetak","Hotel Vinayak Palaces"};

        String [] prices={"1000","2000","2100","3100"};

        ListAdapter myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,places);

        // ListAdapter myadapter1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,prices);
        ListView mylistview=(ListView)findViewById(R.id.listview);
        // ListView mylistview1=(ListView)findViewById(R.id.listview1);


        mylistview.setAdapter(myadapter);
        //  mylistview1.setAdapter(myadapter1);
        mylistview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                        String place=String.valueOf(adapterView.getItemAtPosition(position));
                        Toast.makeText(getApplicationContext(), place, Toast.LENGTH_SHORT).show();
                        if(place.equalsIgnoreCase("Hotel Kirti Plaza"))
                        {
                            Intent i=new Intent(getApplicationContext(),hotelkirtiplaza.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("Hotel Meera"))
                        {
                            Intent i=new Intent(getApplicationContext(),hotelkirtiplaza.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("Hotel Chetak"))
                        {
                            Intent i=new Intent(getApplicationContext(),hotelkirtiplaza.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("Hotel Vinayak Palace"))
                        {
                            Intent i=new Intent(getApplicationContext(),hotelkirtiplaza.class);
                            startActivity(i);
                        }

                    }
                }

        );

    }
}
