package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void get_started (View view){
        Intent i = new Intent(MainActivity.this, UserActivity.class);
        startActivity(i);
    }

    public void public_service_rules (View view) {
        Context context = getApplicationContext();
        String text = "Please Click on Get Started";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void immigration_duties (View view) {
        Context context = getApplicationContext();
        String text = "Please Click on Get Started";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
