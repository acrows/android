package com.example.myapplication.exp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp2_login);

        Button login = findViewById(R.id.loginButton);
        Button register = findViewById(R.id.registerButton);
        login.setOnClickListener(v -> {
            EditText ET_username = findViewById(R.id.usernameEditText);
            String username = ET_username.getText().toString();
            EditText ET_password = findViewById(R.id.passwordEditText);
            String password = ET_password.getText().toString();
            if (username.equals("root") && password.equals("123456")) {
                Intent intent = new Intent(LoginActivity.this, LoginSuccess.class);
                startActivity(intent);
            } else {
                Toast.makeText(LoginActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
            }
        });
        register.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);

        });
    }
}