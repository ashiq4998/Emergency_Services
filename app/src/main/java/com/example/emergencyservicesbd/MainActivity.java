package com.example.emergencyservicesbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button serviceButton;
    Button contactinfoButton;
    Button aboutinfoButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceButton = (Button) findViewById(R.id.servicesButton);
        serviceButton.setOnClickListener(this);

        contactinfoButton = (Button) findViewById(R.id.contactButton);
        contactinfoButton.setOnClickListener(this);


        aboutinfoButton = (Button) findViewById(R.id.aboutButton);
        aboutinfoButton.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Intent serviceIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(serviceIntent);

        Intent contactIntent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(contactIntent);

        Intent aboutIntent = new Intent(MainActivity.this, FourthActivity.class);
        startActivity(aboutIntent);

    }

}

