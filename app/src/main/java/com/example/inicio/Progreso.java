package com.example.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class Progreso extends AppCompatActivity {

    ProgressBar pb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progreso);
        pb1=(ProgressBar) findViewById(R.id.progressBar);
        pb1.setProgress(55);
    }
}
