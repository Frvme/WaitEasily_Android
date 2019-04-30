package com.example.waiteasily_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InscriptionActivity extends AppCompatActivity {
    EditText signUpUser;
    EditText signUpEmail;
    EditText signUpPassword;
    EditText signUpPasswordConfirm;
    Button signUpButton;
    TextView inputSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        signUpUser = (EditText) findViewById(R.id.input_UserName);
        signUpEmail = (EditText) findViewById(R.id.inscription_email);
        signUpPassword = (EditText) findViewById(R.id.inscription_password);
        signUpPasswordConfirm = (EditText) findViewById(R.id.inscription_re_password);
        inputSignIn = (TextView) findViewById(R.id.link_signin2);
        inputSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signInIntent = new Intent(InscriptionActivity.this, MainActivity.class);
                startActivity(signInIntent);
            }
        });
    }
}
