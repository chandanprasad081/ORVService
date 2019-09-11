package com.example.browseimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    EditText et1;
    TextView createaccount;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et1 = findViewById(R.id.email);
        createaccount = findViewById(R.id.createaccount);

        Intent intent = getIntent();
        value = intent.getStringExtra("name");
//        et1.setText(value);
        createaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value.equals("user")) {
                    Intent intent=new Intent(Login.this,User_register.class);
                    startActivity(intent);
                }
                else if (value.equals("admin")) {
                    Intent intent=new Intent(Login.this,Create_business.class);
                    startActivity(intent);
                }
                else if (value.equals("business")) {
                    Intent intent=new Intent(Login.this,Business_registration.class);
                    startActivity(intent);
                }
                else {

                }
            }
        });
    }

}
