package com.example.waiteasily_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    EditText signInEmail;
    EditText signInPassword;
    Button signInButton;
    TextView inputSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signInEmail = (EditText) findViewById(R.id.input_email);
        signInPassword = (EditText) findViewById(R.id.input_password);
        signInButton = (Button)findViewById(R.id.btn_login);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        inputSignup = (TextView) findViewById(R.id.link_signup2);
        inputSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUpIntent = new Intent(LoginActivity.this, InscriptionActivity.class);
                startActivity(signUpIntent);
            }
        });


    }
}
