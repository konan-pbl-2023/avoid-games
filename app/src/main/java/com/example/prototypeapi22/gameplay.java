package com.example.prototypeapi22;

import android.content.Intent;
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

import com.example.prototypeapi22.databinding.GameplayBinding;

import java.util.Timer;
import java.util.TimerTask;

public class gameplay extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private GameplayBinding binding;

    private ImageView jiki;
    private ImageView syougai;
    private ImageView obstacle;
    private float syougaiY;
    private float initJikiX = 380f;
    private float jikiY;
    private float initsyougaiY=0f;
    private float initsyougaiX=380f;

    private int i;
    int cnt = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = GameplayBinding.inflate(getLayoutInflater());
        setContentView(R.layout.gameplay);
        jiki = (ImageView) findViewById(R.id.jiki);
        obstacle = (ImageView) findViewById(R.id.syougai);

        syougaiY=initsyougaiY;

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                int syougai[] = {2, 1, 1, 2, 1, 0, 1, 2, 2, 1};
                if (syougai[i] == 0) {
                    obstacle.setX(0);
                }
                else if (syougai[i] == 1) {
                    obstacle.setX(380);
                }
                else if (syougai[i] == 2) {
                    obstacle.setX(760);
                }
                syougaiY+=10;
                if(syougaiY==1800){
                    syougaiY=initsyougaiY;
                    i++;
                }
                if(i==10){
                    i=0;
                }
                obstacle.setY(syougaiY);
                if(((Math.abs(jiki.getX()-obstacle.getX())<10))&&((Math.abs(jiki.getY()-obstacle.getY())<50))){
                            next();
                }

            }


        }, 100, 10);


        findViewById(R.id.hidari).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("prev_cnt", String.valueOf(cnt) );

                if (cnt == 0) {
                    cnt = 0;
                } else {
                    cnt--;
                }
                float jikiX = initJikiX * cnt;
                jiki.setX(jikiX);

                Log.d("cnt", String.valueOf(cnt) + "/pos:"+  String.valueOf(jiki.getX()));
            }
        });
        findViewById(R.id.migi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("prev_cnt", String.valueOf(cnt) );
                if (cnt == 2) {
                    cnt = 2;
                } else {
                    cnt++;
                }

                float jikiX = initJikiX * cnt;
                jiki.setX(jikiX);
                Log.d("cnt", String.valueOf(cnt) + "/pos:"+  String.valueOf(jiki.getX()));
            }
        });
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {

                }
            });

        findViewById(R.id.kisetu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change();
            }
        });





//        Button button2 = findViewById(R.id.kisetu);
//        button2.setOnClickListener(v ->
//          );
    }





    void next() {
        Intent intent = new Intent(this, FINISH1.class);
        finishAndRemoveTask();
        startActivity(intent);
    }
    void change() {
        Intent intent = new Intent(this, gameplay2.class);
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
