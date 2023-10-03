package com.example.armour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputEditText;

public class RegistrationActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);



        ImageButton backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            Intent intRegister = new Intent(RegistrationActivity.this,LoginActivity.class);
            startActivity(intRegister);
        });

        AppCompatButton startBtn = findViewById(R.id.startBtn);
        startBtn.setOnClickListener(view -> {
            Intent intRegister = new Intent(RegistrationActivity.this,MainActivity.class);
            startActivity(intRegister);

        });

    }
}