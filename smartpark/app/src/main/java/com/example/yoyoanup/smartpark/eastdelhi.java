package com.example.yoyoanup.smartpark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class eastdelhi extends AppCompatActivity {
    int pkakdham,pkjhandewalan,pkyamuna,pkpreet;


    void getinitiakdham() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        DatabaseReference azadpurinitialref = myRef.child("parkstatuseast").child("Akshardhaminitializer");
        azadpurinitialref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String initialval = dataSnapshot.getValue(String.class);
                int init = Integer.parseInt(initialval);
                pkakdham = init;
            }


            @Override
            public void onCancelled(DatabaseError error) {



            }
        });
    }


    void getinitijhandewal() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        DatabaseReference azadpurinitialref = myRef.child("parkstatuseast").child("Jhandewalaninitializer");
        azadpurinitialref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String initialval = dataSnapshot.getValue(String.class);
                int init = Integer.parseInt(initialval);
                pkjhandewalan = init;
            }


            @Override
            public void onCancelled(DatabaseError error) {



            }
        });
    }


    void getinitiyamuna() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        DatabaseReference yamunainitialref = myRef.child("parkstatuseast").child("YamunaBankinitializer");
        yamunainitialref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String initialval = dataSnapshot.getValue(String.class);
                int init = Integer.parseInt(initialval);
                pkyamuna = init;
            }


            @Override
            public void onCancelled(DatabaseError error) {



            }
        });
    }



    void getinitiapreet() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        DatabaseReference azadpurinitialref = myRef.child("parkstatuseast").child("Preet Viharinitializer");
        azadpurinitialref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String initialval = dataSnapshot.getValue(String.class);
                int init = Integer.parseInt(initialval);
                pkpreet = init;
            }


            @Override
            public void onCancelled(DatabaseError error) {



            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eastdelhi);
        getinitiakdham();
        getinitijhandewal();
        getinitiyamuna();

    }




    public void allocatespace(View view) {
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef;
        myRef=database.getReference();
        DatabaseReference myRef2= myRef.child("parkstatuseast").child("Akshardham");
        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String aksr = dataSnapshot.getValue(String.class);
                int aksr_dham=Integer.parseInt(aksr);

                //radio button function
                RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(i);
                String s=rb.getText().toString();
                //  Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();


                if(s.equalsIgnoreCase("AkShardham"))
                {
                    if(pkakdham<aksr_dham)
                    {
                        Toast.makeText(getApplicationContext(),"booking confirmed",Toast.LENGTH_SHORT).show();
                        pkakdham++;
                        String pkval=Integer.toString(pkakdham);
                        DatabaseReference myRef=database.getReference("parkstatuseast");
                        myRef.child("Akshardhaminitializer").setValue(pkval);

                        Intent inn=new Intent(getApplicationContext(),confirmbooking.class);
                        String spot="g-112,Akshardham ,Azad pur \n new Delhi-110033\n \n Attendant-Vinay Yadav \nContact Number -9871187093";
                        inn.putExtra("first",spot);
                        startActivity(inn);
                    }
                    else
                    {
                        Intent no=new Intent(getApplicationContext(),bookingcancel.class);
                        startActivity(no);                    }

                }


            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        DatabaseReference myRef3= myRef.child("parkstatuseast").child("Jhandewalan");
        myRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String aksr = dataSnapshot.getValue(String.class);
                int jhande_walan=Integer.parseInt(aksr);

                //radio button function
                RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(i);
                String s=rb.getText().toString();
                //  Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();


                if(s.equalsIgnoreCase("Jhandewalan"))
                {
                    if(pkjhandewalan<jhande_walan)
                    {
                        Toast.makeText(getApplicationContext(),"booking confirmed",Toast.LENGTH_SHORT).show();
                        pkjhandewalan++;
                        String pkval=Integer.toString(pkjhandewalan);
                        DatabaseReference myRef=database.getReference("parkstatuseast");
                        myRef.child("Jhandewalaninitializer").setValue(pkval);

                        Intent inn=new Intent(getApplicationContext(),confirmbooking.class);
                        String spot="g-112,Jhandewalan \n new Delhi-110033\n \n Attendant-Vinay Yadav \nContact Number -9871187093";
                        inn.putExtra("first",spot);
                        startActivity(inn);
                    }
                    else
                    {
                        Intent no=new Intent(getApplicationContext(),bookingcancel.class);
                        startActivity(no);                    }

                }


            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



        DatabaseReference myRef4= myRef.child("parkstatuseast").child("YamunaBank");
        myRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String aksr = dataSnapshot.getValue(String.class);
                int yamuna_bank=Integer.parseInt(aksr);

                //radio button function
                RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(i);
                String s=rb.getText().toString();
                //  Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();


                if(s.equalsIgnoreCase("Yamuna Bank"))
                {
                    if(pkyamuna<yamuna_bank)
                    {
                        Toast.makeText(getApplicationContext(),"booking confirmed",Toast.LENGTH_SHORT).show();
                        pkyamuna++;
                        String pkval=Integer.toString(pkyamuna);
                        DatabaseReference myRef=database.getReference("parkstatuseast");
                        myRef.child("YamunaBankinitializer").setValue(pkval);

                        Intent inn=new Intent(getApplicationContext(),confirmbooking.class);
                        String spot="g-112,yamuna bank, near metro stn. \n new Delhi-110033\n \n Attendant-Vinay Yadav \nContact Number -9871187093";
                        inn.putExtra("first",spot);
                        startActivity(inn);
                    }
                    else
                    {
                        Intent no=new Intent(getApplicationContext(),bookingcancel.class);
                        startActivity(no);                    }

                }


            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });




        DatabaseReference myRef5= myRef.child("parkstatuseast").child("Preet Vihar");
        myRef5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String aksr = dataSnapshot.getValue(String.class);
                int preet_=Integer.parseInt(aksr);

                //radio button function
                RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(i);
                String s=rb.getText().toString();
                //  Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();


                if(s.equalsIgnoreCase("Preet Vihar"))
                {
                    if(pkpreet<preet_)
                    {
                        Toast.makeText(getApplicationContext(),"booking confirmed",Toast.LENGTH_SHORT).show();
                        pkpreet++;
                        String pkval=Integer.toString(pkpreet);
                        DatabaseReference myRef=database.getReference("parkstatuseast");
                        myRef.child("Preet Viharinitializer").setValue(pkval);

                        Intent inn=new Intent(getApplicationContext(),confirmbooking.class);
                        String spot="g-112,Preet Vihar, near metro stn. \n new Delhi-110033\n \n Attendant-Vinay Yadav \nContact Number -9871187093";
                        inn.putExtra("first",spot);
                        startActivity(inn);
                    }
                    else
                    {
                        Intent no=new Intent(getApplicationContext(),bookingcancel.class);
                        startActivity(no);                    }

                }


            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



    }
}
