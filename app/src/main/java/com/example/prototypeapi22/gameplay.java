package com.example.prototypeapi22;

import android.content.Intent;
import android.os.Bundle;

import com.example.prototypeapi22.databinding.ActivityFinish1Binding;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.prototypeapi22.databinding.GameplayBinding;

public class gameplay extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private GameplayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = GameplayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });

        setContentView(binding.getRoot());

        Button button = findViewById(R.id.next);
        button.setOnClickListener(v ->
                next()
        );
    }

    void next(){
        Intent intent = new Intent(this, FINISH1.class);
        finishAndRemoveTask();
        startActivity(intent);
    }
}
