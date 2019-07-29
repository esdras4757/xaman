package com.example.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class cliente extends AppCompatActivity {

DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference();
DatabaseReference child1=databaseReference.child("bebida");
DatabaseReference child2=databaseReference.child("iniciar");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

    }



    public void cosmopolitan (View view){
        child1.setValue("cosmopolitan");
        Intent intent= new Intent(cliente.this,Progreso.class);
        startActivity(intent);
    }

    public void margarita(View view){
        child1.setValue("margarita");
        Intent intent= new Intent(cliente.this,Progreso.class);
        startActivity(intent);
    }




}
