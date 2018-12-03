package com.example.andrew.mp6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button higherButton;
    private Button lowerButton;
    private Button menuButton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameplay_screen);

        menuButton1 = findViewById(R.id.Main_Menu);
        lowerButton = findViewById(R.id.Lower);
        higherButton = findViewById(R.id.Higher);

        menuButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome_Screen();
            }
        });

        lowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome_Screen();
            }
        });

        higherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome_Screen();
            }
        });

    }

    public void openHome_Screen() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
