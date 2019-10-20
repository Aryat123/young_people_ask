package com.example.youngask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Registration_page extends AppCompatActivity {

    private Button sign_up_button_send_to_database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        sign_up_button_send_to_database = findViewById(R.id.sign_up_button_send_to_database);

        sign_up_button_send_to_database.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Registration_page.this, "Bottom Navigation tab is coming soon", Toast.LENGTH_SHORT).show();
                Intent tabsContainer = new Intent(Registration_page.this, ListViewActivity.class);
                startActivity(tabsContainer);
            }
        });
    }
}
