package com.example.prototypeapi22;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.content.Intent;
import android.widget.Button;

import com.example.prototypeapi22.databinding.ActivityFinish1Binding;

public class FINISH1 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityFinish1Binding binding;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFinish1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button button = findViewById(R.id.restart);
        button.setOnClickListener(v ->
                restart()
        );
        mediaPlayer = MediaPlayer.create(this, R.raw.owari);
        mediaPlayer.start();

    }
    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
    }
    void restart(){
        Intent intent = new Intent(this, TITLE1.class);
        finishAndRemoveTask();
        startActivity(intent);
    }
}