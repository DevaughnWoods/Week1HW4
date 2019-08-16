package com.example.passingdata;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Second Activity");

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("FIRSTNAME");
        String lastName = intent.getStringExtra("LASTNAME");
        String address = intent.getStringExtra("ADDRESS");
        String city = intent.getStringExtra("CITY");
        String state = intent.getStringExtra("STATE");
        String zip = intent.getStringExtra("ZIP");

        TextView mResultTv = findViewById(R.id.resultTv);

        mResultTv.setText("First Name: "+firstName+"\nLast Name: "+lastName+"\nAddress: "+address+"\nCity: "+city+"\nState: "+state+"\nZip: "+zip);

    }
}
