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

public class chittorgarhtourgide extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chhitorgarhmonuments);
        String [] guides={"Anil Kumar","Meena Singh","HOney Sharma","Yogendra singh"};
        ListAdapter myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,guides);
        ListView mylistview=(ListView)findViewById(R.id.listview);

        mylistview.setAdapter(myadapter);
        mylistview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                        String place=String.valueOf(adapterView.getItemAtPosition(position));
                        Toast.makeText(getApplicationContext(), place, Toast.LENGTH_SHORT).show();
                        if(place.equalsIgnoreCase("Anil Kumar"))
                        {
                            Intent i=new Intent(getApplicationContext(),anilkumar.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("Meena Singh"))
                        {
                            Intent i=new Intent(getApplicationContext(),anilkumar.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("Honey sharma"))
                        {
                            Intent i=new Intent(getApplicationContext(),anilkumar.class);
                            startActivity(i);
                        }
                        else  if(place.equalsIgnoreCase("Yogendra singh"))
                        {
                            Intent i=new Intent(getApplicationContext(),anilkumar.class);
                            startActivity(i);
                        }

                    }
                }

        );
    }
}
