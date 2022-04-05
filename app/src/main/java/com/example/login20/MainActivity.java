package com.example.login20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimatedImageDrawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText contraseña,usuario;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Hola método onCreate", Toast.LENGTH_LONG).show();
        boton = findViewById(R.id.boton);
        contraseña =findViewById(R.id.contraseña);
        usuario =findViewById(R.id.usuario);
        imageView = findViewById(R.id.imageView2);




        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                if (contraseña.getText().toString().matches("") || usuario.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "el campo vacidos", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "el campo esta llenos", Toast.LENGTH_SHORT).show();
                    Intent boton = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(boton);
                }
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"Hola método onpause", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Hola método on destroy", Toast.LENGTH_LONG).show();
    }
}