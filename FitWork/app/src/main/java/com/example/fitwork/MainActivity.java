package com.example.fitwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    Animation topAnime, bottomAnime;
    TextView topText, bottomText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnime = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnime = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        topText = findViewById(R.id.textView);
        bottomText = findViewById(R.id.textView2);

        topText.setAnimation(topAnime);
        bottomText.setAnimation(bottomAnime);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =  new Intent(MainActivity.this,Login_Activity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);



    }
}