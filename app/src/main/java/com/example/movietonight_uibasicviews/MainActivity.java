package com.example.movietonight_uibasicviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button quickQuizButton = findViewById(R.id.quickQuizButton);
        final Button groupQuizButton = findViewById(R.id.groupQuizButton);
        final Button loginButton = findViewById(R.id.loginButton);

        quickQuizButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, QuickQuizActivity.class);
            startActivity(intent);
        });

        groupQuizButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GroupQuizActivity.class);
            startActivity(intent);
        });

        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}