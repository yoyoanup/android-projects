package com.example.yoyoanup.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class chokhidanimenu extends AppCompatActivity {
    CheckBox pizza, burger, sandwich, coke;
    Button button;
    int qty;
    EditText q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chokhidanimenu);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick() {

        pizza = (CheckBox) findViewById(R.id.c1);
        burger = (CheckBox) findViewById(R.id.c2);
        sandwich = (CheckBox) findViewById(R.id.c3);
        coke = (CheckBox) findViewById(R.id.c4);
        button = (Button) findViewById(R.id.bt);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          int total = 0;
                                          int amt = 0;
                                          StringBuilder result = new StringBuilder();
                                          result.append("Your Bill is :\n");
                                          if (pizza.isChecked()) {
                                              q = (EditText) findViewById(R.id.et1);
                                              qty = Integer.parseInt(q.getText().toString());
                                              result.append(qty + "\tPizza   " + qty + "x 150\n");
                                              amt = (150 * qty);
                                              total = total + amt;

                                          }

                                          if (burger.isChecked()) {
                                              q = (EditText) findViewById(R.id.et2);
                                              qty = Integer.parseInt(q.getText().toString());
                                              result.append(qty + "\tBurger   " + qty + "x 80\n");
                                              amt = (80 * qty);
                                              total = total + amt;

                                          }

                                          if (sandwich.isChecked()) {
                                              q = (EditText) findViewById(R.id.et3);
                                              qty = Integer.parseInt(q.getText().toString());
                                              result.append(qty + "\tSandwich   " + qty + "x 60\n");
                                              amt = (60 * qty);
                                              total = total + amt;

                                          }

                                          if (coke.isChecked()) {
                                              q = (EditText) findViewById(R.id.et4);
                                              qty = Integer.parseInt(q.getText().toString());
                                              result.append(qty + "\tCoke   " + qty + "x 50\n");
                                              amt = (50 * qty);
                                              total = total + amt;

                                          }

                                          result.append("\nTotal Bill : Rs. " + total);
                                          Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
                                      }
                                  }
        );


    }
}
