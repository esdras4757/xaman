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

    public void tequilasunrise (View view){
        child1.setValue("tequilasunrise");
        Intent intent= new Intent(cliente.this,Progreso.class);
        startActivity(intent);
    }
    public void alexander (View view){
        child1.setValue("alexander");
        Intent intent= new Intent(cliente.this,Progreso.class);
        startActivity(intent);
    }
    public void pousecafe (View view){
        child1.setValue("pousecafe");
        Intent intent= new Intent(cliente.this,Progreso.class);
        startActivity(intent);
    }
    public void zombie (View view){
        child1.setValue("zombie");
        Intent intent= new Intent(cliente.this,Progreso.class);
        startActivity(intent);
    }
    public void ginytonic (View view){
        child1.setValue("ginytonic");
        Intent intent= new Intent(cliente.this,Progreso.class);
        startActivity(intent);
    }
    public void joeysdrink (View view){
        child1.setValue("joeysdrink");
        Intent intent= new Intent(cliente.this,Progreso.class);
        startActivity(intent);
    }
    public void rumycola (View view){
        child1.setValue("rumycola");
        Intent intent= new Intent(cliente.this,Progreso.class);
        startActivity(intent);
    }
    public void iespick (View view){
        child1.setValue("iespick");
        Intent intent= new Intent(cliente.this,Progreso.class);
        startActivity(intent);
    }




}
