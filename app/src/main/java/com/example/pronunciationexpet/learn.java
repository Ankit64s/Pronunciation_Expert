package com.example.pronunciationexpet;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class learn extends AppCompatActivity implements TextToSpeech.OnInitListener {
    Button b1,b2,b3;
    EditText e1;
    String s1;
    TextToSpeech tts1, tts2, tts3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        b1=findViewById(R.id.slow);
        b2=findViewById(R.id.moderate);
        b3=findViewById(R.id.fast);
        e1=findViewById(R.id.edit);
        tts1 = new TextToSpeech(learn.this, this);
        tts2 = new TextToSpeech(learn.this, this);
        tts3 = new TextToSpeech(learn.this, this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                tts1.speak(s1, TextToSpeech.QUEUE_ADD,null);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                tts2.speak(s1, TextToSpeech.QUEUE_ADD,null);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                tts3.speak(s1, TextToSpeech.QUEUE_ADD,null);
            }
        });

    }

    @Override
    public void onInit(int i) {
        tts1.setLanguage(Locale.ENGLISH);
        tts1.setSpeechRate(0.5f);

        tts2.setLanguage(Locale.ENGLISH);
        tts2.setSpeechRate(1.0f);

        tts3.setLanguage(Locale.ENGLISH);
        tts3.setSpeechRate(2.0f);

    }
}
