package com.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class thinkingAvtivity extends AppCompatActivity {

    static SharedPrefManager sharedPrefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thinking_avtivity);
        sharedPrefManager =SharedPrefManager.getInstance(this);

        sharedPrefManager.writeString("1","دائرة");
        sharedPrefManager.writeString("2","مثلث");
        sharedPrefManager.writeString("3","مستطيل");
        sharedPrefManager.writeString("4","مربع");

        sharedPrefManager.readString("1","0");


    }
}