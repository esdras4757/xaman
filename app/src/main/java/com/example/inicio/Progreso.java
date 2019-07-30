package com.example.inicio;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Progreso extends AppCompatActivity {

    DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference();
    DatabaseReference child3=databaseReference.child("porcentaje");

    ProgressBar pb1;
    TextView porcentaje,creando;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progreso);
        pb1=(ProgressBar) findViewById(R.id.progressBar);
        porcentaje=(TextView)findViewById(R.id.textViewporcentaje) ;
        creando=(TextView)findViewById(R.id.textVcreando) ;
        iv1=(ImageView)findViewById(R.id.IMAGENCHECK);



    }
    int x=0;
    @Override
    protected void onStart() {
        super.onStart();

        child3.addValueEventListener(new ValueEventListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String texto =dataSnapshot.getValue().toString();
                porcentaje.setText(texto+"%");

                if(texto.equals("100")){
                   x=1;
                }

                if(x==1){

                    porcentaje.setVisibility(View.INVISIBLE);
                    creando.setVisibility(View.INVISIBLE);
                    pb1.setVisibility(View.INVISIBLE);
                    iv1.setVisibility(View.VISIBLE);


                    int duracion = 3000;
                    new Handler().postDelayed(new Runnable() {

                        public void run() {
                            Intent intent = new Intent(Progreso.this, USUARIO.class);
                            porcentaje.setVisibility(View.INVISIBLE);
                            creando.setVisibility(View.INVISIBLE);
                            pb1.setVisibility(View.INVISIBLE);
                            iv1.setVisibility(View.VISIBLE);
                            x=0;
                            startActivity(intent);
                            finish();
                        }
                    }, duracion);

                }
                else{

                    porcentaje.setVisibility(View.VISIBLE);
                    creando.setVisibility(View.VISIBLE);
                    pb1.setVisibility(View.VISIBLE);
                    iv1.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
