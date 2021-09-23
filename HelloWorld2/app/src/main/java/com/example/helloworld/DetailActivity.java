package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    private String name;
    private String email;

    private TextView nameTextView;
    private TextView emailTextView;
    private Button next2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bundle bundle = getIntent().getExtras();
         //name =  bundle.getString("name");
         //email = bundle.getString("email");

        name = DataSingleton.getInstance().getName();
        email = DataSingleton.getInstance().getEmail();

        name = name + "jajajaja";
        DataSingleton.getInstance().setName(name);

        nameTextView = findViewById(R.id.nameTextView);
        emailTextView = findViewById(R.id.emailTextView);

        nameTextView.setText(name);
        emailTextView.setText(email);

        next2Button = findViewById(R.id.next2Button);
        next2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Detail2Activity.class);
                //intent.putExtra("nombrecito", name);
                //intent.putExtra("correito", email);
                startActivity(intent);
            }
        });


    }
}