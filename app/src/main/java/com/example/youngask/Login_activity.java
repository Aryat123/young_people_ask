package com.example.youngask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login_activity extends AppCompatActivity {

    Button sign_up_button_send_to_database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

        sign_up_button_send_to_database = findViewById(R.id.sign_up_button_send_to_database);

        sign_up_button_send_to_database.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Login_activity.this, "You have clicked me!", Toast.LENGTH_SHORT).show();
                Intent login_intent = new Intent(Login_activity.this, TabContainerHomeActivity.class);
                startActivity(login_intent);
            }
        });
    }

}
