package com.example.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText nameInput = findViewById(R.id.nameInput);
        Button submitButton = findViewById(R.id.submitButton);
        TextView resultText = findViewById(R.id.resultText);

        submitButton.setOnClickListener(v -> {
            String name = nameInput.getText().toString();
            resultText.setText("Hello, " + name + "!");
        });
    }
}