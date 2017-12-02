package com.example.yoyoanup.lv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] fruits={"apple","mango","guava"};
        ListAdapter myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fruits);
        ListView mylistview=(ListView)findViewById(R.id.listview);
        mylistview.setAdapter(myadapter);
        mylistview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                        String fruit=String.valueOf(adapterView.getItemAtPosition(position));
                        //Toast.makeText(MainActivity.this, fruit, Toast.LENGTH_SHORT).show();
                        if(fruit.equalsIgnoreCase("apple"))
                        {
                            Intent i=new Intent(getApplicationContext(),apple.class);
                            startActivity(i);
                        }

                    }
                }

        );
    }


    }
