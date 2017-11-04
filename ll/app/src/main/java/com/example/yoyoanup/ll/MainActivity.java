package com.example.yoyoanup.ll;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fire(View view) {
        myRef=database.getReference();
        DatabaseReference myRef1= myRef.child("user").child("name");
      myRef1.addValueEventListener(new ValueEventListener() {
          @Override
          public void onDataChange(DataSnapshot dataSnapshot) {
              String naam = dataSnapshot.getValue(String.class);
              //Toast.makeText(MainActivity.this, naam, Toast.LENGTH_SHORT).show();
              TextView tvv=(TextView)findViewById(R.id.textView);
              tvv.setText(naam);
          }

          @Override
          public void onCancelled(DatabaseError databaseError) {

          }
      });

        myRef=database.getReference();
        DatabaseReference myRef2= myRef.child("user").child("age");
        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String age = dataSnapshot.getValue(String.class);
                int a=Integer.parseInt(age);
                if(a> 16) {
                    Toast.makeText(MainActivity.this,"yes", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this,"no", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}
