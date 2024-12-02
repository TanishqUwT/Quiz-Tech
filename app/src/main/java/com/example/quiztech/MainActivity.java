package com.example.quiztech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        View Login = findViewById(R.id.button1);
        View Signup= findViewById(R.id.signupbutton);

        Login.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent= new Intent (MainActivity.this,Home.class);
                startActivity(intent);
            }
        });


        Signup.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent = new Intent (MainActivity.this,Registration.class);
                startActivity(intent);
            }
        });
    }
}