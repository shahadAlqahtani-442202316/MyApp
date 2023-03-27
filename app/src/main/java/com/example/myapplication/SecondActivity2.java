package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.widget.TextView;
public class SecondActivity2 extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        tv = findViewById(R.id.msg);
        Intent i = getIntent();
        String s = i.getStringExtra("PersonName2");
        tv.setText("Hwllo," +s+ " !");

    }
}