package com.alc.simpleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);


    }

    public void onViewAboutALC(View view){
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }

    public void onViewAboutProfile(View view){
        Intent intent = new Intent(this, ActivityC.class);
        startActivity(intent);
    }
}
