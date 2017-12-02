package com.example.yoyoanup.rajsthan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class chhitorgarhmonuments extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chhitorgarhmonuments);
        String [] places={"Chittorgarh Fort","Padmini Temple","Vijay Stambh","Kalika Mata Temple"};
        ListAdapter myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,places);
        ListView mylistview=(ListView)findViewById(R.id.listview);

        mylistview.setAdapter(myadapter);
        mylistview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                        String place=String.valueOf(adapterView.getItemAtPosition(position));
                        Toast.makeText(getApplicationContext(), place, Toast.LENGTH_SHORT).show();
                        if(place.equalsIgnoreCase("chittorgarh fort"))
                        {
                            Intent i=new Intent(getApplicationContext(),chittorgarhfort.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("padmini temple"))
                        {
                            Intent i=new Intent(getApplicationContext(),chittorgarhfort.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("kalika mata temple"))
                        {
                            Intent i=new Intent(getApplicationContext(),chittorgarhfort.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("vijay stambh"))
                        {
                            Intent i=new Intent(getApplicationContext(),chittorgarhfort.class);
                            startActivity(i);
                        }

                    }
                }

        );
    }
}
