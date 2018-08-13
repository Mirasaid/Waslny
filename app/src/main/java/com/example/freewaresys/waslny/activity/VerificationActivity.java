package com.example.freewaresys.waslny.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.freewaresys.waslny.R;

public class VerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        Intent intent = getIntent();
        String phoneNumber = intent.getExtras().getString("phone");

        TextView textView = (TextView) findViewById(R.id.myTextView);

        textView.setText("This is the authenticated phone number " + phoneNumber);
    }
    }
