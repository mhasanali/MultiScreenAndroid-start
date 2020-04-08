package com.example.multiscreenlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String uName="hasan";
    String uPin="1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logIn(View view){
        EditText et1=findViewById(R.id.editText1);
        EditText et2=findViewById(R.id.editText2);
        String name=et1.getText().toString().toLowerCase();
        String pin=et2.getText().toString().toLowerCase();
        if (name.equals(uName) && pin.equals(uPin)) {
            Intent intent=new Intent(this, Logged_In.class);
            Logged_In logged_in=new Logged_In();
            intent.putExtra("demo_key for name",name);
            startActivity(intent);
        }
        else
        {
            Log.d("result", "invalid");
        }
    }
}
