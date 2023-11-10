package com.example.prototypeapi22;

import android.media.Image;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.ImageView;

public class gameplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_gameplay);

        Button rightButton = (Button) findViewById(R.id.rightButton);
        rightButton.setOnClickListener(view -> {
            ImageView charaImg = (ImageView) findViewById(R.id.charaImg);
            charaImg.setX(80);
        });
    }

}