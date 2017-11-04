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

public class delhisouthloc extends AppCompatActivity {
    int pksaket,pkhaujkhas,pkghitorni,pkchhatarpur,pkarjangarh;

    void getinitialsaket() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        DatabaseReference saketinitialref = myRef.child("parkstatussouth").child("saketinitializer");
        saketinitialref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String initialval = dataSnapshot.getValue(String.class);
                int init = Integer.parseInt(initialval);
                pksaket = init;
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


    void getinitialhaujkhas()
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        DatabaseReference haujkhasinitialref = myRef.child("parkstatussouth").child("haujkhasinitializer");
        haujkhasinitialref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String initialval = dataSnapshot.getValue(String.class);
                int init = Integer.parseInt(initialval);
                pkhaujkhas = init;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


    void getinitialghitorni()
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        DatabaseReference ghitorniref = myRef.child("parkstatussouth").child("ghitorniinitializer");
        ghitorniref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String initialval = dataSnapshot.getValue(String.class);
                int init = Integer.parseInt(initialval);
                pkghitorni = init;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }



    void getinitialchhatarpur()
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        DatabaseReference vidhansabharef = myRef.child("parkstatussouth").child("chhatarpurinitializer");
        vidhansabharef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String initialval = dataSnapshot.getValue(String.class);
                int init = Integer.parseInt(initialval);
                pkchhatarpur = init;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


    void getinitialarjangarh()
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        DatabaseReference gtbnagarref = myRef.child("parkstatussouth").child("arjangarhinitializer");
        gtbnagarref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String initialval = dataSnapshot.getValue(String.class);
                int init = Integer.parseInt(initialval);
                pkarjangarh = init;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhisouthloc);
        RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
        getinitialghitorni();
        getinitialchhatarpur();
        getinitialarjangarh();
        getinitialsaket();
       getinitialhaujkhas();
    }

    public void allocatespace(View view) {
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef;
        myRef=database.getReference();

        //
        //saket data fetch  myRef2 is pointing to data of saket
        DatabaseReference myRef2= myRef.child("parkstatussouth").child("saket");
        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String saket = dataSnapshot.getValue(String.class);
                int saket_=Integer.parseInt(saket);

                //radio button function
                RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(i);
                String s=rb.getText().toString();
                //  Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();


                if(s.equalsIgnoreCase("saket"))
                {
                    if(pksaket<saket_)
                    {
                        Toast.makeText(getApplicationContext(),"booking confirmed",Toast.LENGTH_SHORT).show();
                        pksaket++;
                        String pkval=Integer.toString(pksaket);
                        DatabaseReference myRef=database.getReference("parkstatussouth");
                        myRef.child("saketinitializer").setValue(pkval);

                        Intent inn=new Intent(getApplicationContext(),confirmbooking.class);
                        String spot="g-112,Kailash Tower ,Saket \n new Delhi-110033\n \n Attendant-Vinay Yadav \nContact Number -9871187093";
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




        DatabaseReference myRef1= myRef.child("parkstatussouth").child("haujkhas");
        myRef1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String jpuri = dataSnapshot.getValue(String.class);
                int hauj_khas=Integer.parseInt(jpuri);

                //radio button function
                RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(i);
                String s=rb.getText().toString();
                //Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();




                if(s.equalsIgnoreCase("haujkhas"))
                {
                    if(pkhaujkhas<hauj_khas)
                    {
                        Toast.makeText(getApplicationContext(),"booking confirmed",Toast.LENGTH_SHORT).show();
                        pkhaujkhas++;
                        String pkval=Integer.toString(pkhaujkhas);
                        DatabaseReference myRef=database.getReference("parkstatussouth");
                        myRef.child("haujkhasinitializer").setValue(pkval);
                        //intent

                        Intent inn=new Intent(getApplicationContext(),confirmbooking.class);
                        String spot="A/316,  haujhkhas \n new Delhi-110036\n \n Attendant-Raj kapoor \nContact Number -9871187093";
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







        DatabaseReference myRef3= myRef.child("parkstatussouth").child("ghitorni");
        myRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String jpuri = dataSnapshot.getValue(String.class);
                int ghitorni_=Integer.parseInt(jpuri);

                //radio button function
                RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(i);
                String s=rb.getText().toString();
                //Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();




                if(s.equalsIgnoreCase("ghitorni"))
                {
                    if(pkhaujkhas<ghitorni_)
                    {
                        Toast.makeText(getApplicationContext(),"booking confirmed",Toast.LENGTH_SHORT).show();
                        pkghitorni++;
                        String pkval=Integer.toString(pkghitorni);
                        DatabaseReference myRef=database.getReference("parkstatussouth");
                        myRef.child("ghitorniinitializer").setValue(pkval);
                        //intent

                        Intent inn=new Intent(getApplicationContext(),confirmbooking.class);
                        String spot="A/316,  ghitorni \n new Delhi-110036\n \n Attendant-Raj kapoor \nContact Number -9871187093";
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





        DatabaseReference myRef4= myRef.child("parkstatussouth").child("arjangarh");
        myRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String arjangarh = dataSnapshot.getValue(String.class);
                int arjangarh_=Integer.parseInt(arjangarh);

                //radio button function
                RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(i);
                String s=rb.getText().toString();
                //Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();




                if(s.equalsIgnoreCase("arjangarh"))
                {
                    if(pkarjangarh<arjangarh_)
                    {
                        Toast.makeText(getApplicationContext(),"booking confirmed",Toast.LENGTH_SHORT).show();
                        pkghitorni++;
                        String pkval=Integer.toString(pkghitorni);
                        DatabaseReference myRef=database.getReference("parkstatussouth");
                        myRef.child("arjangarhinitializer").setValue(pkval);
                        //intent

                        Intent inn=new Intent(getApplicationContext(),confirmbooking.class);
                        String spot="A/316,  arjan garh  \n new Delhi-110036\n \n Attendant-Raj kapoor \nContact Number -9871187093";
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





        DatabaseReference myRef5= myRef.child("parkstatussouth").child("chhatarpur");
        myRef5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String chhatarpur = dataSnapshot.getValue(String.class);
                int chhatarpur_=Integer.parseInt(chhatarpur);

                //radio button function
                RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(i);
                String s=rb.getText().toString();
                //Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();




                if(s.equalsIgnoreCase("chhatarpur"))
                {
                    if(pkchhatarpur<chhatarpur_)
                    {
                        Toast.makeText(getApplicationContext(),"booking confirmed",Toast.LENGTH_SHORT).show();
                        pkghitorni++;
                        String pkval=Integer.toString(pkghitorni);
                        DatabaseReference myRef=database.getReference("parkstatussouth");
                        myRef.child("chhatarpurinitializer").setValue(pkval);
                        //intent

                        Intent inn=new Intent(getApplicationContext(),confirmbooking.class);
                        String spot="A/316,  chhatarpur   \n new Delhi-110036\n \n Attendant-Raj kapoor \nContact Number -9871187093";
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
