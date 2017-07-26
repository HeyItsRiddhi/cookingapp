package com.example.riddhipraise.cookingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


public class SignUp extends AppCompatActivity {

    //user info that will be passed
    public static String username;
    public static String email;

    private EditText usernameText;
    private EditText emailText;

    //get the info
    String getUsername;
    String getEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void goToMainPage(View view){
        Intent intent = new Intent(this, Home.class);

        //get the user name
        usernameText = (EditText) findViewById(R.id.userName);
        getUsername = String.valueOf(usernameText.getText());
        intent.putExtra(username, getUsername);

        //get the email
        emailText = (EditText) findViewById(R.id.email);
        getEmail = String.valueOf(emailText.getText());
        intent.putExtra(email, getEmail);

        //start the next activity
        startActivity(intent);
    }
}
