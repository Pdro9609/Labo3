package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_share extends AppCompatActivity {
    TextView mShareText;
    private String text_aux

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        mShareText= findViewById(R.id.shared_text);
        text_aux = "Texto quemado";
        Intent new_intent = getIntent();
        if (new_intent!= null){
            text_aux= new_intent.getStringExtra(Intent.EXTRA_TEXT);
        }
    }
}

