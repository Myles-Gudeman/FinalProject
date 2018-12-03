package com.example.andrew.mp6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

    }

    public void openHome_Screen2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

