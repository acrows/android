package com.example.myapplication.exp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

public class RegisterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp2_register);

        Button register = findViewById(R.id.register);
        register.setOnClickListener(v -> {
            EditText ET_username = findViewById(R.id.usernameRegister);
            String username = ET_username.getText().toString();
            EditText ET_password = findViewById(R.id.passwordRegister);
            String password = ET_password.getText().toString();
            EditText confirm_password = findViewById(R.id.confirmPasswordEditText);
            String confirmPassword = confirm_password.getText().toString();
            if (password.equals(confirmPassword)) {
                Intent intent = new Intent(RegisterActivity.this, RegisterSuccess.class);
                intent.putExtra("username", username);
                startActivity(intent);
            } else {
                Toast.makeText(RegisterActivity.this, "两次输入的密码不一致", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
