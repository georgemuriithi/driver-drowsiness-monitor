package com.example.jipjung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = findViewById(R.id.start);
        start.setOnClickListener(v -> openDrowsinessDetectorActivity());
    }

    public void openDrowsinessDetectorActivity(){
        Intent intent = new Intent(this, DrowsinessDetectorActivity.class);
        startActivity(intent);
    }
}