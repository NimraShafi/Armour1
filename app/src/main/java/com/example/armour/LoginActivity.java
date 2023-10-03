package com.example.armour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AppCompatButton loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intLogin = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intLogin);

            }
        });
        TextView registerTxt = findViewById(R.id.registerTxt);
        registerTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intRegisterTxt = new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(intRegisterTxt);
            }
        });
    }
}