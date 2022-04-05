package com.example.login20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBindings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity3 extends AppCompatActivity  {


    CheckBox checkBox1;
    CheckBox checkBox2;
     Button boton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

         checkBox1 = findViewById(R.id.checkBox1);
         checkBox2 = findViewById(R.id.checkBox2);
         boton1 = findViewById(R.id.buton1);

         boton1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (checkBox1.isChecked()) {
                     Toast.makeText(getApplicationContext(), "YUUUPII", Toast.LENGTH_SHORT).show();

                 } else {
                     if (checkBox2.isChecked())
                         Toast.makeText(getApplicationContext(), "HAA QUE FALTO", Toast.LENGTH_SHORT).show();

                 }
             }
         });

        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video2;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);


        ImageButton img = (ImageButton) findViewById(R.id.imageButton);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(img);
            }
        });
    }


    }
