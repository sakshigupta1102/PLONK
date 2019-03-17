package com.example.sakshigupta.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {
    FirebaseDatabase Database;
    DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Database= FirebaseDatabase.getInstance();
    }

    public void buttonclicked(View view) {

         EditText number = (EditText) findViewById(R.id.editText);
         EditText time = (EditText) findViewById(R.id.editText2);
         String child= number.getText().toString();
         myRef= Database.getReference("vehicle").child(child);
        myRef.child("time").push().setValue(time.getText().toString());
        myRef.child("number").push().setValue(number.getText().toString());





    }
}
