package com.example.minggu_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        getSupportActionBar().setTitle("Frame Layout");
    }
}