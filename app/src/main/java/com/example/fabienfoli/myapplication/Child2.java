package com.example.fabienfoli.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Child2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child2);

        Button buttonBack;

        buttonBack = (Button) findViewById(R.id.button4);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                Intent intentCI = new Intent(Child2.this, MainActivity.class);
                startActivity(intentCI);
            }
        });

    }

}