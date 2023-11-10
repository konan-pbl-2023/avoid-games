package com.example.prototypeapi22;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.prototypeapi22.databinding.ActivityTitle1Binding;

public class TITLE1 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityTitle1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTitle1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.start.setOnClickListener((View v) ->
        {
            startActivity(new Intent(this, gameplay.class));
        });
    }
}