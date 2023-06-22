package com.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity or any other desired activity
                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);
                finish(); // Remove the splash screen activity from the back stack
            }
        }, 3000);

    }
}