package com.example.prototypeapi22;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.prototypeapi22.databinding.ActivityFinish1Binding;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prototypeapi22.databinding.Gameplay2Binding;

public class gameplay2 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private Gameplay2Binding binding;

    private ImageView jiki2;
    private float initJikiX2 = 387f;
    private float jikiY2;

    int cnt2 = 1;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Gameplay2Binding.inflate(getLayoutInflater());
        setContentView(R.layout.gameplay2);

        jiki2 = (ImageView) findViewById(R.id.jiki2);

        findViewById(R.id.hidari2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("prev_cnt", String.valueOf(cnt2) );

                if (cnt2 == 0) {
                    cnt2 = 0;
                } else {
                    cnt2--;
                }
                float jikiX2 = initJikiX2 * cnt2;
                jiki2.setX(jikiX2);
            }
        });
        findViewById(R.id.migi2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("prev_cnt", String.valueOf(cnt2) );
                if (cnt2 == 2) {
                    cnt2 = 2;
                } else {
                    cnt2++;
                }

                float jikiX = initJikiX2* cnt2;
                jiki2.setX(jikiX);
                Log.d("cnt", String.valueOf(cnt2) + "/pos:"+  String.valueOf(jiki2.getX()));
            }
        });
        findViewById(R.id.next2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        findViewById(R.id.kisetu2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change();
            }
        });



        Button button = findViewById(R.id.next2);
        button.setOnClickListener(v ->
                next()
        );
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.kurisumasusong);
        mediaPlayer.start();//        Button button2 = findViewById(R.id.kisetu);
//        button2.setOnClickListener(v ->
//        );
    }
    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
    }





    void next() {
        Intent intent = new Intent(this, FINISH1.class);
        finishAndRemoveTask();
        startActivity(intent);
    }
    void change() {
        Intent intent = new Intent(this, gameplay.class);
        finishAndRemoveTask();
        startActivity(intent);
    }

/*
    int syougai[] = {0, 1, 1, 2, 1, 0, 1, 2, 2, 1};
    int syougaix;
    int syougaiy;
    float syougaispeed;

    int r = 180;//hankei
    int NUM = 10;
    int i,life;
    /*
    左矢印のボタンで左に、右矢印のボタンで右に行く
    */
        /*
    for(i=0;i<NUM;i++)
    {
        if (syougai[i] == 0) {
            syougaix = 180;
        }
        if (syougai[i] == 1) {
            syougaix = 540;
        }
        if (syougai[i] == 2) {
            syougaix = 900;
        }
        if(i==NUM-1){
            i=0;
    }
        if(dist(jikix,180,syougaix,syougaiy)<180)
        {
            life--;
        }
    }
*/
}
