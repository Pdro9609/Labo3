package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    TextView mText1;
    Button mSubmitAction;
    String text_aux;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mText1= findViewById(R.id.prueba_text);
        mSubmitAction = findViewById(R.id.submit2_action);


        Intent new_intent = getIntent();

        if(new_intent != null){
            text_aux= new_intent.getStringExtra(AppConstants.TEXT1_kEY);
            mText1.setText(new_intent.getStringExtra(AppConstants.TEXT1_kEY));
        }
        mText1.setText(text_aux);

        mSubmitAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent2 = new Intent();

                m_intent2.setAction(Intent.ACTION_SEND);
                m_intent2.setType("text/plain");

                m_intent2.putExtra(Intent.EXTRA_TEXT, text_aux);
                startActivity(m_intent2);
            }
        });
    }
}
