package com.example.prototypeapi22;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFinish1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button button = findViewById(R.id.restart);
        button.setOnClickListener(v ->
                restart()
        );

    }
    void restart(){
        Intent intent = new Intent(this, TITLE1.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        finish();
//        finishAfterTransition();
        finishAndRemoveTask();
        startActivity(intent);
    }
}