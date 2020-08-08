package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Contact_Us extends AppCompatActivity {

    TextView conect_login_page,connect_about_us_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        conect_login_page = findViewById(R.id.contact_us_to_login_here);
        connect_about_us_page = findViewById(R.id.contact_us_to_about_us);

        conect_login_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contact_login = new Intent(Contact_Us.this, MainActivity.class);
                startActivity(contact_login);
            }
        });

        connect_about_us_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contact_about_us = new Intent(Contact_Us.this, About_Us.class);
                startActivity(contact_about_us);
            }
        });

    }
}