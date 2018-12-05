package com.example.andrew.mp6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private Button start;
    private Button lower;
    private Button higher;
    private Button mainMenu;

    private TextView currentScore;
    private TextView invisible;

    private Random random1;

    private int displayNumber;
    private int numberNew;
    private int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameplay_screen);

        start = findViewById(R.id.Start);
        lower = findViewById(R.id.lower);
        higher = findViewById(R.id.higher);
        mainMenu = findViewById(R.id.Main_Menu);

        start.setVisibility(View.VISIBLE);
        lower.setVisibility(View.INVISIBLE);
        higher.setVisibility(View.INVISIBLE);
        mainMenu.setVisibility(View.VISIBLE);


        currentScore = findViewById(R.id.currentScore);
        invisible = findViewById(R.id.invisibleNumber);

        random1 = new Random();

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayNumber = random1.nextInt(100) + 1;
                invisible.setText(("" + displayNumber));
                score = 0;
                currentScore.setText(("Score: " + score));

                start.setVisibility(View.INVISIBLE);
                lower.setVisibility(View.VISIBLE);
                higher.setVisibility(View.VISIBLE);
            }
        });

        lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberNew = random1.nextInt(100) + 1;
                invisible.setText(("" + numberNew));
                if (numberNew <= displayNumber) {
                    score++;
                    currentScore.setText(("Score: " + score));
                    displayNumber = numberNew;
                }
                else {
                    currentScore.setText(("Score: " + score + "\nGame Over!"));
                    start.setVisibility(View.VISIBLE);
                    lower.setVisibility(View.INVISIBLE);
                    higher.setVisibility(View.INVISIBLE);
                }
            }
        });

        higher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberNew = random1.nextInt(100) + 1;
                invisible.setText(("" + numberNew));
                if (numberNew >= displayNumber) {
                    score++;
                    currentScore.setText(("Score: " + score));
                    displayNumber = numberNew;
                }
                else {
                    currentScore.setText(("Score: " + score + "\nGame Over!"));
                    start.setVisibility(View.VISIBLE);
                    lower.setVisibility(View.INVISIBLE);
                    higher.setVisibility(View.INVISIBLE);
                }
            }
        });

        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome_Screen();
            }
        });
    }
    public void openHome_Screen() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}