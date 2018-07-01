package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PublicServiceRules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_service_rules);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
// get the name
        String names = extras.getString(Intent.EXTRA_TEXT);
        if (names != null) {
            // insert the name in the text field
            TextView name = (TextView) findViewById(R.id.name);
            name.setText("Welcome: " + names);
        }
    }

    /*Define a global variable to handle the scores*/
    int score = 0;


    /*Define RadioButtons for the correct answer*/
    RadioButton fir_thi,
            sec_thi,
            thi_sec,
            for_fir,
            fif_sec;

    /*Define variables for the checkboxes*/
    CheckBox check1, check2, check3;

    /*Function to handle the submit*/
    public void submit(View view) {
        Bundle extras = getIntent().getExtras();

// get the name
        String names = extras.getString(Intent.EXTRA_TEXT);

        /*Reset score back to zero every time the submit is called */
        score = 0;


        /*Question 1 answer*/
        fir_thi = (RadioButton) findViewById(R.id.fir_thi);
        boolean first = fir_thi.isChecked();

        if (first) {
            score += 1;
        }

        /*Question 2 answer*/
        sec_thi = (RadioButton) findViewById(R.id.sec_thi);
        boolean second = fir_thi.isChecked();

        if (second) {
            score += 1;
        }

        /*Question 3 answer*/
        thi_sec = (RadioButton) findViewById(R.id.thi_sec);
        boolean third = thi_sec.isChecked();

        if (third) {
            score += 1;
        }

        /*Question 4 answer*/
        for_fir = (RadioButton) findViewById(R.id.for_fir);
        boolean forth = for_fir.isChecked();

        if (forth) {
            score += 1;
        }

        /*Question 5 answer*/
        fif_sec = (RadioButton) findViewById(R.id.fif_sec);
        boolean fifth = fif_sec.isChecked();

        if (fifth) {
            score += 1;
        }

        /*Question 6 answer*/
        check1 = (CheckBox) findViewById(R.id.check1);
        check2 = (CheckBox) findViewById(R.id.check2);
        check3 = (CheckBox) findViewById(R.id.check3);

        if (check1.isChecked() && check2.isChecked() && !check3.isChecked()) {
            score += 1;
        }
        /*Toast message to display result*/
        Toast.makeText(getBaseContext(), "Name: " + names + "\nYou got a total of " + score + " marks out of 6!", Toast.LENGTH_SHORT).show();



    }
}
