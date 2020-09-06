package com.enike.piksure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {



    private static int SPLASH_TIMEOUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        removeStatusBar();

        setContentView(R.layout.activity_main);
        changeGradient();

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this, Welcome_Activity.class);
              //  Animation animation7 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadeout);
                startActivity(homeIntent);
              //  overridePendingTransition(R.anim.fadein,R.anim.fadeout);
                finish(); }
        },SPLASH_TIMEOUT);


    }

    public void changeGradient(){
        RelativeLayout layout = findViewById(R.id.splashscreenlyout);
        AnimationDrawable drawable = (AnimationDrawable) layout.getBackground();
        drawable.setEnterFadeDuration(2000);
        drawable.setExitFadeDuration(2000);
        drawable.start();
    }

    public void removeStatusBar(){
        requestWindowFeature(1);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
    }
}