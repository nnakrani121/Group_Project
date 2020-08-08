package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class About_Us extends AppCompatActivity {

    TextView contact_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        contact_us = findViewById(R.id.aboutus_to_contact_us);

        contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contact_us_i = new Intent(About_Us.this, Contact_Us.class);
                startActivity(contact_us_i);
            }
        });
    }
}