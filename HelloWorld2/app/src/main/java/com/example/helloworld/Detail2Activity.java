package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detail2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);


        //Bundle bundle = getIntent().getExtras();
        //String name = bundle.getString("nombrecito");
        //String email = bundle.getString("correito");

        String name = DataSingleton.getInstance().getName();
        String email = DataSingleton.getInstance().getEmail();

        ((TextView)findViewById(R.id.nameEditText2)).setText(name);
        ((TextView)findViewById(R.id.emailEditText2)).setText(email);
    }
}