package com.example.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView usuario,contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario= (TextView)findViewById(R.id.et_usuario);
        contraseña= (TextView)findViewById(R.id.et_contraseña);
    }

    public void iniciarsesionButton (View view){

        if(usuario.getText().toString().equals("user")&&contraseña.getText().toString().equals("user")){
            Toast.makeText(this,"Inisiando sesion...",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"Usuario o contraseña incorrectos",Toast.LENGTH_SHORT).show();
        }
    }
}
