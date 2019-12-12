package com.bibek.supermarketshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private  textView Info;
    private  Button Login;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = (EditText) findViewById(R.id.etName) ;
        Password = (EditText) findViewById(R.id.etPassword) ;
        Info = (textView) findViewById(R.id.tvinfo) ;
        Login = (Button) findViewById(R.id.btnLogin);



    }
    private void validate (string userNAme, String userPassword){
        if ((userName == "Admin") && (userPassword =="1234")){
            Intent intent = new Intent (MainActivity.this, SecondActivity.class);

        }

    }
}
