package com.bibek.supermarketshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
username =
password=
login=

private void signup() {
    sharedpreferences sharedpreferences = getSharedpreferences(name: "user", MODE_PRIVATE);
    sharedPreferences.Editor editor = SharedPreference.edit();

    editor.putString("username", etUSername.getText().toString());
    editor.putString("password", etPassword.getText().toString()),

        Toast.makeText(context:this, text:"succesfully Refistered", Toast.LENGTH_SHORT).show();
        }

