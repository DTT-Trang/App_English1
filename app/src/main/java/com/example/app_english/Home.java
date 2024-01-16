package com.example.app_english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {

    Button btnHoc;
    Button btnMycategory;
    Button btn_Translator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnHoc = findViewById(R.id.btnHoc);
        btnHoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,categoryEnglish.class);
                startActivity(intent);
            }
        });

        btnMycategory= findViewById(R.id.btnMyVocabulary);
        btnMycategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,myVocabulary.class);
                startActivity(intent);
            }
        });

        btn_Translator= findViewById(R.id.btnTranslator);
        btn_Translator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,EnglishTranslator.class);
                startActivity(intent);
            }
        });
    }
}