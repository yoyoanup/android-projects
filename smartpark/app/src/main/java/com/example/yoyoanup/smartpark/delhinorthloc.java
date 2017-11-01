package com.example.yoyoanup.smartpark;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class delhinorthloc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhinorthloc);
        RadioGroup rg=(RadioGroup)findViewById(R.id.radiogroup);

    }

    public void allocatespace(View view) {
        RadioGroup rg=(RadioGroup)findViewById(R.id.radiogroup);
        boolean checked=((RadioButton)view).isChecked();
        switch(view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radio_ninjas:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
    }
}
