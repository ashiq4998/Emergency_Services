package com.example.emergencyservicesbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener{

    Button backToMain2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        backToMain2Button = (Button) findViewById(R.id.back2Button);
        backToMain2Button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent back2Intent = new Intent(ThirdActivity.this, MainActivity.class);
        startActivity(back2Intent);
    }
}