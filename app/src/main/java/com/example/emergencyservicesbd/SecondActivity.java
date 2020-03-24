package com.example.emergencyservicesbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button backToMain1Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        backToMain1Button = (Button) findViewById(R.id.back1Button);
        backToMain1Button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent back1Intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(back1Intent);
    }
}