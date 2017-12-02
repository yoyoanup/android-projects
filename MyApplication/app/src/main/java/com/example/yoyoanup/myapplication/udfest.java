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

public class udfest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udfest);

        String [] places={"Mewar Festival","The Ganguar Festival","The Shepgram Craft festival"};



        ListAdapter myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,places);


        ListView mylistview=(ListView)findViewById(R.id.listview);



        mylistview.setAdapter(myadapter);

        mylistview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                        String place=String.valueOf(adapterView.getItemAtPosition(position));
                        Toast.makeText(getApplicationContext(), place, Toast.LENGTH_SHORT).show();
                        if(place.equalsIgnoreCase("Mewar Festival"))
                        {
                            Intent i=new Intent(getApplicationContext(),mewarfest.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("The Ganguar festival"))
                        {
                            Intent i=new Intent(getApplicationContext(),mewarfest.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("the shepgram craft festival"))
                        {
                            Intent i=new Intent(getApplicationContext(),mewarfest.class);
                            startActivity(i);
                        }

                    }
                }

        );

    }
}
