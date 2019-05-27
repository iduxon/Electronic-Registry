package com.example.eskola.forme;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.eskola.R;

public class FinansijeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finansije);

        FloatingActionButton floatingActionButton = findViewById(R.id.finansije_fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FinansijeActivity.this, UplatnicaActivity.class);
                startActivity(i);
            }
        });
    }
}
