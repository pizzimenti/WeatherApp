package com.example.guest.weatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SevenDayActivity extends AppCompatActivity {
    public static final String TAG = SevenDayActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_day);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");

    }
}
