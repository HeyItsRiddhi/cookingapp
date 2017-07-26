package com.example.riddhipraise.cookingapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class UserProfileTab extends Fragment {
    EditText username;
    EditText email;
    EditText password;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Get the view from activity_user_profile_tab.xml
        View view = inflater.inflate(R.layout.activity_user_profile_tab, container, false);
        Intent intent = getActivity().getIntent();

        //set the username
        username = (EditText) view.findViewById(R.id.username);
        String usernameText = intent.getStringExtra(SignUp.username);
        username.setText(usernameText);
        username.setClickable(false);

        //set the email
        email = (EditText) view.findViewById(R.id.email);
        String emailText = intent.getStringExtra(SignUp.email);
        email.setText(emailText);
        email.setClickable(false);

        return view;
    }

    public void editUserName(){
        username = (EditText) getActivity().findViewById(R.id.username);
        username.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
        username.setClickable(true);

    }

    public void editEmail(){
        email = (EditText) getActivity().findViewById(R.id.email);
        email.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        email.setClickable(true);
    }


}
