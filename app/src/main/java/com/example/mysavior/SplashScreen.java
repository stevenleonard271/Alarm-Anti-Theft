package com.example.mysavior;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    private int waktu_loading =2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // begitu memasuki splash screen ini
                Intent splash = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(splash);
                finish();
            }
        }, waktu_loading);


    }
}