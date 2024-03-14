package com.example.movietonight_uibasicviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.file.attribute.GroupPrincipal;

public class GroupQuizActivity extends AppCompatActivity {

    Button backButton, loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_quiz);
        backButton = findViewById(R.id.backButtonGroup);
        loginButton = findViewById(R.id.changeNameButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(GroupQuizActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}