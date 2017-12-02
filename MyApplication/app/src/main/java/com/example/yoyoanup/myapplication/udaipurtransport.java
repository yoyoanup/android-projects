package com.example.yoyoanup.myapplication;

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

public class udaipurtransport extends AppCompatActivity {
    int pkgtbnagar,pkcivilline,pkvidhansabha;


    void getinitialcivillines()
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        DatabaseReference civillinesref = myRef.child("parkstatus").child("civillinesinitializer");
        civillinesref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String initialval = dataSnapshot.getValue(String.class);
                int init = Integer.parseInt(initialval);
                pkcivilline = init;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }



    void getinitiavidhansabha()
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        DatabaseReference vidhansabharef = myRef.child("parkstatus").child("vidhansabhainitializer");
        vidhansabharef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String initialval = dataSnapshot.getValue(String.class);
                int init = Integer.parseInt(initialval);
                pkvidhansabha = init;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


    void getinitiagtbnagar()
    {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        DatabaseReference gtbnagarref = myRef.child("parkstatus").child("gtbnagarinitializer");
        gtbnagarref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String initialval = dataSnapshot.getValue(String.class);
                int init = Integer.parseInt(initialval);
                pkgtbnagar = init;

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udaipurtransport);
        RadioGroup rg=(RadioGroup)findViewById(R.id.radio);

        getinitialcivillines();
        getinitiavidhansabha();
        getinitiagtbnagar();

    }

    public void allocatespace(View view) {

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef;
        myRef=database.getReference();

        //civillines data fetch  myRef3 is pointing to data
        DatabaseReference myRef3= myRef.child("parkstatus").child("civillineslimit");
        myRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String civilines = dataSnapshot.getValue(String.class);
                int civil_lines=Integer.parseInt(civilines);

                //radio button function
                RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(i);
                String s=rb.getText().toString();
                //  Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();


                if(s.equalsIgnoreCase("civil lines"))
                {
                    if(pkcivilline<civil_lines)
                    {
                        Toast.makeText(getApplicationContext(),"booking confirmed",Toast.LENGTH_SHORT).show();
                        pkcivilline++;
                        String pkval=Integer.toString(pkcivilline);
                        DatabaseReference myRef=database.getReference("parkstatus");
                        myRef.child("civillinesinitializer").setValue(pkval);

                        Intent inn=new Intent(getApplicationContext(),confirmbooking.class);
                        String spot="136\3, West Civil Lines \nBehind sansad bhawan \n new Delhi-110042\n \n Attendant-Honey Sharma \nContact Number -9871187094";
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



        //gtbnagar data fetch  myRef4 is pointing to data
        DatabaseReference myRef4= myRef.child("parkstatus").child("gtbnagarlimit");
        myRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String gtbnagar = dataSnapshot.getValue(String.class);
                int gtb_nagar=Integer.parseInt(gtbnagar);

                //radio button function
                RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(i);
                String s=rb.getText().toString();
                //  Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();


                if(s.equalsIgnoreCase("gtb nagar"))
                {
                    if( pkgtbnagar<gtb_nagar)
                    {
                        Toast.makeText(getApplicationContext(),"booking confirmed",Toast.LENGTH_SHORT).show();
                        pkgtbnagar++;
                        String pkval=Integer.toString( pkgtbnagar);
                        DatabaseReference myRef=database.getReference("parkstatus");
                        myRef.child("gtbnagarinitializer").setValue(pkval);

                        Intent inn=new Intent(getApplicationContext(),confirmbooking.class);
                        String spot="136\3, Gtb Nagar, Hudson Lane \nBehind g.p Jeweller \n new Delhi-110056\n \n Attendant-Madhu Sharma \nContact Number -9871187098";
                        inn.putExtra("first",spot);
                        startActivity(inn);


                    }
                    else
                    {
                        Intent no=new Intent(getApplicationContext(),bookingcancel.class);
                        startActivity(no);
                    }

                }


            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });





        //vidhansabhalimit data fetch  myRef5 is pointing to data
        DatabaseReference myRef5= myRef.child("parkstatus").child("vidhansabhalimit");
        myRef5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                String vidhansabha = dataSnapshot.getValue(String.class);
                int vidhan_sabha=Integer.parseInt(vidhansabha);

                //radio button function
                RadioGroup rg=(RadioGroup)findViewById(R.id.radio);
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(i);
                String s=rb.getText().toString();
                //  Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();


                if(s.equalsIgnoreCase("vidhan sabha"))
                {
                    if(pkvidhansabha<vidhan_sabha)
                    {
                        Toast.makeText(getApplicationContext(),"booking confirmed",Toast.LENGTH_SHORT).show();
                        pkvidhansabha++;
                        String pkval=Integer.toString(pkvidhansabha);
                        DatabaseReference myRef=database.getReference("parkstatus");
                        myRef.child("vidhansabhainitializer").setValue(pkval);

                        Intent inn=new Intent(getApplicationContext(),confirmbooking.class);
                        String spot="a-112,Vidhan Sabha \n Behind sansad bhawan \n new Delhi-110045\n \n Attendant-Bobby Sharma \nContact Number -9871187094";
                        inn.putExtra("first",spot);
                        startActivity(inn);
                    }
                    else
                    {
                        Intent no=new Intent(getApplicationContext(),bookingcancel.class);
                        startActivity(no);
                    }

                }


            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
