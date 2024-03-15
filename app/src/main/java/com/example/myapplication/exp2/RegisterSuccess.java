package com.example.myapplication.exp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class RegisterSuccess extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp2_registersuccess);
        Intent intent = getIntent();
        String alert = intent.getStringExtra("username") + "注册成功";
        TextView textView = findViewById(R.id.registerSuccessText);
        textView.setText(alert);
    }
}
