package com.example.youngask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sign_up_button;
    private Button login_button_one;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_up_button = findViewById(R.id.sign_up_button);
        login_button_one = findViewById(R.id.login_button_one);


        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You have clicked me!", Toast.LENGTH_SHORT).show();
                Intent register_intent = new Intent(MainActivity.this, Registration_page.class);
                startActivity(register_intent);
            }
        });

        login_button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You have clicked me!", Toast.LENGTH_SHORT).show();
                Intent login_intent = new Intent(MainActivity.this, Login_activity.class);
                startActivity(login_intent);
            }
        });
    }
}
