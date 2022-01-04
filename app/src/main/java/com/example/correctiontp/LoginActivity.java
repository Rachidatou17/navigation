package com.example.correctiontp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class LoginActivity extends AppCompatActivity {
    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=findViewById(R.id.Email);
        password=findViewById(R.id.Password);
    }

    public void onlogin(View view) {
        String emailvalue, passwordvalue;
        emailvalue=login.getText().toString();
        passwordvalue=password.getText().toString();
        if (emailvalue.equals(""))
            login.setError("email is required");
        if (passwordvalue.equals(""))
            password.setError("password is required");

        if (emailvalue.equals("login@gmail.com") && passwordvalue.equals("abcdef"))
        {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "login et password incorrets", Toast.LENGTH_SHORT).show();
        }
        if (emailvalue.isEmpty()){
            login.setError("email is required");
            login.requestFocus();
            return;
        }

    }

}