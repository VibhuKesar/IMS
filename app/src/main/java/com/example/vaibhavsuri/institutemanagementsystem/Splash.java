package com.example.vaibhavsuri.institutemanagementsystem;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import teacherims.DecisionActivity;

public class Splash extends AppCompatActivity {

    public static int Time = 1050;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {                  //runnable is a class contains RUN()
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, DecisionActivity.class);
                startActivity(i);
                finish();
            }


        }, Time);
    }
}