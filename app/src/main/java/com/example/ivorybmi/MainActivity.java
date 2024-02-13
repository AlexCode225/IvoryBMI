package com.example.ivorybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
//Alex CODE
//ALEXCODE225
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//Alex CODE
//ALEXCODE225

       // Get a reference to the button
        ImageView getstarted = findViewById(R.id.getstartedbtn);

        // Set an OnClickListener for the button
        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity (replace `BMICalculatorActivity` with your desired activity)
                Intent intent = new Intent(MainActivity.this, App1.class);
                startActivity(intent);
            }
            //Alex CODE
//ALEXCODE225
        });

        }

    }
//Alex CODE
//ALEXCODE225