package com.example.passingdata;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("First Activity");

        final EditText mFirstName = findViewById(R.id.firstName);
        final EditText mLastName = findViewById(R.id.lastName);
        final EditText mAddress = findViewById(R.id.address);
        final EditText mCity = findViewById(R.id.city);
        final EditText mState = findViewById(R.id.state);
        final EditText mZip = findViewById(R.id.zip);

        Button mSaveBtn = findViewById(R.id.saveBtn);

        mSaveBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String firstName = mFirstName.getText().toString();
                String lastName = mLastName.getText().toString();
                String address = mAddress.getText().toString();
                String city = mCity.getText().toString();
                String state = mState.getText().toString();
                String zip = mZip.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("FIRSTNAME", firstName);
                intent.putExtra("LASTNAME", lastName);
                intent.putExtra("ADDRESS", address);
                intent.putExtra("CITY", city);
                intent.putExtra("STATE", state);
                intent.putExtra("ZIP", zip);
                startActivity(intent);


            }
        });
    }
}
