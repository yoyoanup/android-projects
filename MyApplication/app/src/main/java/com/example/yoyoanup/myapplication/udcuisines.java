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

public class udcuisines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udcuisines);

        String [] places={"Dal bati","Ghewar","Mirchibara"};



        ListAdapter myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,places);


        ListView mylistview=(ListView)findViewById(R.id.listview);



        mylistview.setAdapter(myadapter);

        mylistview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                        String place=String.valueOf(adapterView.getItemAtPosition(position));
                        Toast.makeText(getApplicationContext(), place, Toast.LENGTH_SHORT).show();
                        if(place.equalsIgnoreCase("dal bati"))
                        {
                            Intent i=new Intent(getApplicationContext(),dalbati.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("ghewar"))
                        {
                            Intent i=new Intent(getApplicationContext(),dalbati.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("mirchibara"))
                        {
                            Intent i=new Intent(getApplicationContext(),dalbati.class);
                            startActivity(i);
                        }

                    }
                }

        );
    }
}
