package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button nextButton = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
                                          @Override
              public void onClick(View view) {


                  String name = ((EditText)findViewById(R.id.editTextTextPersonName)).getText().toString();

                  String email = ((EditText)findViewById(R.id.editTextEmailAddress)).getText().toString();

                  DataSingleton.getInstance().setEmail(email);
                  DataSingleton.getInstance().setName(name);

                  Intent nextWindow = new Intent(getApplicationContext(), DetailActivity.class);
                  //nextWindow.putExtra("name", name);
                  //nextWindow.putExtra("email", email);
                  startActivity(nextWindow);
              }
          }


        );

    }
}