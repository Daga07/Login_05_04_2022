package com.example.login20;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {

    Button atras;
    CheckBox checkbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        atras = findViewById(R.id.atras);

        ImageButton img = (ImageButton) findViewById(R.id.imboton);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(img);
            }
        });

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atras = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(atras);
            }
        });


    }

}