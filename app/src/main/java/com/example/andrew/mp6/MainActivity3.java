package com.example.andrew.mp6;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private Button menuButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highscore_screen);

        menuButton2 = findViewById(R.id.Main_Menu);

        menuButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome_Screen2();
            }
        });

        TextView score = (TextView) findViewById(R.id.score);
        TextView score1 = (TextView) findViewById(R.id.score1);
        TextView score2 = (TextView) findViewById(R.id.score2);
        TextView score3 = (TextView) findViewById(R.id.score3);
        TextView score4 = (TextView) findViewById(R.id.score4);
        SharedPreferences scorePref = getSharedPreferences("userScore", Context.MODE_PRIVATE);
        int board = scorePref.getInt("first", 0);
        int board1 = scorePref.getInt("second", 0);
        int board2 = scorePref.getInt("third", 0);
        int board3 = scorePref.getInt("fourth", 0);
        int board4 = scorePref.getInt("fifth", 0);
        score.setText(("1st Best:  " + board));
        score1.setText(("2nd Best:  " + board1));
        score2.setText(("3rd Best:  " + board2));
        score3.setText(("4th Best:  " + board3));
        score4.setText(("5th Best:  " + board4));

    }

    public void openHome_Screen2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

