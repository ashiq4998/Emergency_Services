package com.example.emergencyservicesbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity implements View.OnClickListener {

    Button backToMain3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        backToMain3Button = (Button) findViewById(R.id.back3Button);
        backToMain3Button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent back3Intent = new Intent(FourthActivity.this, MainActivity.class);
        startActivity(back3Intent);
    }
}