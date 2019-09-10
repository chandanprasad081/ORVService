package com.example.browseimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tx1, tx2, tx3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1 = findViewById(R.id.user);
        tx2 = findViewById(R.id.admin);
        tx3 = findViewById(R.id.businesslogin);

        tx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserDashbord.class);
                //intent.putExtra("user","user");
                startActivity(intent);
            }
        });
        tx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdminDashbord.class);
               // intent.putExtra("user","user");
                startActivity(intent);
            }
        });
        tx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BusinessDashbord.class);
                //intent.putExtra("user","user");
                startActivity(intent);
            }
        });
    }


}
