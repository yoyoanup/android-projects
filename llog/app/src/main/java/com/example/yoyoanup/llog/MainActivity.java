package com.example.yoyoanup.llog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

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
       /* myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                TextView tvv=(TextView)findViewById(R.id.tv);
                tvv.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/
    }

    public void fire(View view) {
        //EditText e1=(EditText)findViewById(R.id.editText);
        //EditText e2=(EditText)findViewById(R.id.editText2);
      /*  myRef=database.getReference("user");
        myRef.child("name").push().setValue(e1.getText().toString());
        myRef=database.getReference("user");
        myRef.child("age").push().setValue(e2.getText().toString());


        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Map<String,String> map=( Map<String,String>)dataSnapshot.getValue();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/

       /* myRef=database.getReference().child("space");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //EditText e1=(EditText)findViewById(R.id.editText);
                //EditText e2=(EditText)findViewById(R.id.editText2);
                String total_space=(String)dataSnapshot.child("ajadpur").getValue();
                String total_space2=(String)dataSnapshot.child("jahangirpuri").getValue();
                TextView tvv=(TextView)findViewById(R.id.tv);
                //e1.setText(total_space);
               // e2.setText(total_space2);
                tvv.setText(total_space);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/
        myRef=database.getReference().child("use");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override

            public void onDataChange(DataSnapshot dataSnapshot) {

                String total_space=(String)dataSnapshot.child("age").getValue();
                String total_space2=(String)dataSnapshot.child("name").getValue();
                TextView tvv=(TextView)findViewById(R.id.tv);
                tvv.setText(total_space);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
