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

public class udhandi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udhandi);

        String [] places={"Woodcraft","badhani clothes","cloth lantern"};



        ListAdapter myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,places);


        ListView mylistview=(ListView)findViewById(R.id.listview);



        mylistview.setAdapter(myadapter);

        mylistview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                        String place=String.valueOf(adapterView.getItemAtPosition(position));
                        Toast.makeText(getApplicationContext(), place, Toast.LENGTH_SHORT).show();
                        if(place.equalsIgnoreCase("woodcraft"))
                        {
                            Intent i=new Intent(getApplicationContext(),badhanisarees.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("badhani clothes"))
                        {
                            Intent i=new Intent(getApplicationContext(),badhanisarees.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("cloth lantern"))
                        {
                            Intent i=new Intent(getApplicationContext(),badhanisarees.class);
                            startActivity(i);
                        }

                    }
                }

        );

    }
}
