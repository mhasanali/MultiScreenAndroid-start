package com.example.multiscreenlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Logged_In extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged__in);
        Intent intent=getIntent();
        //String msg=intent.getStringExtra("this");
        TextView tv=findViewById(R.id.textViewWelcome);
        tv.append(" : " + intent.getStringExtra("demo_key for name"));
        //TextView tv2=findViewById(R.id.textView);
    }
}
