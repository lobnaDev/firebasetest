package com.example.labon.firebasetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private EditText mtext;
    private DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // myRef=new FirebaseDatabase(https://databasetext-e498d.firebaseio.com/);
        myRef = FirebaseDatabase.getInstance().getReference();
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
       // mDatabase = FirebaseDatabase.getInstance().getReference();
        mtext=(EditText)findViewById(R.id.putValue);
       Button mSentData=(Button)findViewById(R.id.addSrting);
        mSentData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String MyValue=mtext.getText().toString();
                DatabaseReference childRef= myRef.child("Name");
               // childRef.setValue(MyValue);
                myRef.push().setValue(MyValue);
            }
        });
        }
        }
