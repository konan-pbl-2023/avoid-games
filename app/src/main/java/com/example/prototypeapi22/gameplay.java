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
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });
        /*
        findViewById(R.id.hidari).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt==0){
                    cnt=0;
                }
                else{
                    cnt--;
                }
        });
        findViewById(R.id.migi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt==2){
                    cnt=2;
                }
                else{
                    cnt++;
                }
            }
        });
*/
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {

                }
            });

        setContentView(binding.getRoot());

        Button button = findViewById(R.id.next);
        button.setOnClickListener(v ->
                next()
        );
    }

    void next() {
        Intent intent = new Intent(this, FINISH1.class);
        finishAndRemoveTask();
        startActivity(intent);
    }
/*
    int syougai[] = {0, 1, 1, 2, 1, 0, 1, 2, 2, 1};
    int jikix = 540;
    int syougaix;
    int syougaiy;
    float syougaispeed;

    int r = 180;//hankei
    int NUM = 10;
    int cnt = 1;
    int i,life;
    /*
    左矢印のボタンで左に、右矢印のボタンで右に行く
    */
        /*
    if(cnt==0)

    {
        jikix = 180;
    }
    if(cnt==1)

    {
        jikix = 540;
    }
    if(cnt==2)

    {
        jikix = 900;
    }
    for(i=0;i<NUM;i++)
    {
        if (syougai == 0) {
            syougaix = 180;
        }
        if (syougai == 1) {
            syougaix = 540;
        }
        if (syougai == 2) {
            syougaix = 900;
        }
    }
        if(dist(jikix,180,syougaix,syougaiy)<180)
        {
            life--;
        }
    }
*/
}
