package com.example.yoyoanup.rajsthan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class vendor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.vendorchoice, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);

        }
    }

    public void bt(View view) {
        Spinner spinnerr = (Spinner) findViewById(R.id.spinner);
        String spinner_item2 =spinnerr.getSelectedItem().toString();
        if(spinner_item2.equalsIgnoreCase("hotels"))
        {
            Intent i=new Intent(this,chittorgarhhotels.class);
            startActivity(i);

        }
    }
}
