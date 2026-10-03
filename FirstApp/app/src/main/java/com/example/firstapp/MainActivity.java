package com.example.firstapp;

import android.os.*;
import android.view.*;
import android.widget.*;
import androidx.appcompat.app.*;
import android.content.*; // for intent class

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_practice);

        // EditText username = findViewById(R.id.username);
        // EditText password = findViewById(R.id.password);
        // CheckBox remember = findViewById(R.id.checkbox);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(v ->{
            // String name = username.getText().toString();
            // String pass = password.getText().toString();

            // if(name.isEmpty() || pass.isEmpty()){
            //     Toast.makeText(MainActivity.this, "Fill all fields", Toast.LENGTH_LONG).show();
            // }else{
            //     Toast.makeText(MainActivity.this,"Welcome "+ name, Toast.LENGTH_LONG).show();
            // }
            // if(remember.isChecked()){
            //     Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_LONG).show();
            // }else{
            //     Toast.makeText(MainActivity.this, "Not clicked", Toast.LENGTH_LONG).show();
            // }

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        });
    }
}
