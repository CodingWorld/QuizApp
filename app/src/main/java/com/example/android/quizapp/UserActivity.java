package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
    public void public_service_rules (View view){
        EditText name = (EditText) findViewById(R.id.name);
        String newName = name.getText().toString();
        if (newName.matches("")){
            Context context = getApplicationContext();
            String text = "Please Insert Your Name";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        } else {
            Intent i = new Intent(UserActivity.this, PublicServiceRules.class);
            i.putExtra(Intent.EXTRA_TEXT,"" + newName);
            startActivity(i);
        }


    }
    public void immigration_duties (View view) {
        EditText name = (EditText) findViewById(R.id.name);
        String newName = name.getText().toString();
        if (newName.matches("")) {
            Context context = getApplicationContext();
            String text = "Please Insert Your Name";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        } else {
            Intent i = new Intent(UserActivity.this, ImmigrationDuties.class);
            i.putExtra(Intent.EXTRA_TEXT,"" + newName);
            startActivity(i);
        }
    }
}
