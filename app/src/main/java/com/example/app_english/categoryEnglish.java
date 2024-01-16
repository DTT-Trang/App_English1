package com.example.app_english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class categoryEnglish extends AppCompatActivity {

    LinearLayout LiFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_english);

        LiFood = findViewById(R.id.linearLayoutFood);
        LiFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(categoryEnglish.this,Food.class);
                startActivity(intent);
            }
        });
    }
}