package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class loginscreen extends AppCompatActivity {
    Button loginButton;
    EditText usernameField;
    EditText passwordField;
    String CorrectusernameField = "NYIT";
    String CorrectpasswordField = "123";
    String CorrectusernameField2 = "adam";
    String CorrectpasswordField2 = "424";
    //DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
        //myDb = new DatabaseHelper(this);

        loginButton = (Button) findViewById(R.id.Login);
        usernameField = (EditText) findViewById(R.id.UserName);
        passwordField = (EditText) findViewById(R.id.Password);

        {
            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(TextUtils.isEmpty(usernameField.getText().toString()) || TextUtils.isEmpty(usernameField.getText().toString()))
                    {
                        Toast.makeText(loginscreen.this, "Invalid inputs", Toast.LENGTH_LONG).show();
                    }
                    else if(usernameField.getText().toString().equals(CorrectusernameField));
                    {
                        if (passwordField.getText().toString().equals(CorrectpasswordField))
                        {
                            Toast.makeText(loginscreen.this, "Successful Login", Toast.LENGTH_LONG).show();
                            Intent intentLoadNewActivity = new Intent(loginscreen.this, MainActivity.class);
                            startActivity(intentLoadNewActivity);
                        } else
                        {
                            Toast.makeText(loginscreen.this, "Invalid Username or Password", Toast.LENGTH_LONG).show();

                        }

                    }
                    if(TextUtils.isEmpty(usernameField.getText().toString()) || TextUtils.isEmpty(usernameField.getText().toString()))
                    {
                        Toast.makeText(loginscreen.this, "Invalid inputs", Toast.LENGTH_LONG).show();
                    }
                    else if(usernameField.getText().toString().equals(CorrectusernameField2));
                    {
                        if (passwordField.getText().toString().equals(CorrectpasswordField2))
                        {
                            Toast.makeText(loginscreen.this, "Successful Login", Toast.LENGTH_LONG).show();
                            Intent intentLoadNewActivity = new Intent(loginscreen.this, MainActivity.class);
                            startActivity(intentLoadNewActivity);
                        } else
                        {
                            //Toast.makeText(loginscreen.this, "Invalid Username or Password", Toast.LENGTH_LONG).show();

                        }

                    }

                }
            });
        }


    }
}
