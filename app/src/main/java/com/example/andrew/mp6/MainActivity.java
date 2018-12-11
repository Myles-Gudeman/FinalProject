package com.example.andrew.mp6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button playButton;
    private Button scoresButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.Play);
        scoresButton = findViewById(R.id.Scores);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGamePlay_Screen();
            }
        });

        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHighScore_Screen();
            }
        });

    }

    public void openGamePlay_Screen() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openHighScore_Screen() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

}

