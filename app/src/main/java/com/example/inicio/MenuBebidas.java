package com.example.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuBebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bebidas);
    }


    public void botonseleccionarbebida(View view){
        Intent intent=new Intent(MenuBebidas.this,cliente.class);
        startActivity(intent);

    }
}
