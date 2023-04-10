package com.example.proyecto007;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ImageView iv1;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1=findViewById(R.id.imageView);
        b1=findViewById(R.id.boton1);
    }

    public void Ocultar(View v) {
        b1.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.VISIBLE);
    }
}



