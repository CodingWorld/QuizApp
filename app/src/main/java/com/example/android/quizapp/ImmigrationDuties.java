package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ImmigrationDuties extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immigration_duties);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
// get data via the key
        String value1 = extras.getString(Intent.EXTRA_TEXT);
        if (value1 != null) {
            // do something with the data
            TextView name = (TextView) findViewById(R.id.name);
            name.setText("Welcome: " + value1);
        }
    }
}
