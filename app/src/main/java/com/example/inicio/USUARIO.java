package com.example.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class USUARIO extends AppCompatActivity {
    Button ir_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        ir_login=(Button)findViewById(R.id.ir_login);
                ir_login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       Intent ir_login = new Intent(USUARIO.this, Login.class);
                       startActivity(ir_login);

                    }
                });


    }

    public void botonmenu(View view){
        Intent intent=new Intent(USUARIO.this,MenuBebidas.class);
        startActivity(intent);
    }
}
