package com.example.yoyoanup.ad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check(View view) {
        RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
        int i=rg.getCheckedRadioButtonId();
        RadioButton rb=(RadioButton)findViewById(i);
        String s=rb.getText().toString();
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
    }
}
