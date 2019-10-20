package com.example.youngask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListViewActivity extends AppCompatActivity {

    Button list_submit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        list_submit_button = findViewById(R.id.list_submit_button);

        list_submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent user_home_intent = new Intent(ListViewActivity.this, TabContainerHomeActivity.class);
                startActivity(user_home_intent);
            }
        });
    }
}
