package com.example.browseimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {
EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et1=findViewById(R.id.userid);

        Intent intent=getIntent();
        String value=intent.getStringExtra("user");
        et1.setText(value);
    }

}
