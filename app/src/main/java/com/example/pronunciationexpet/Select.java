package com.example.pronunciationexpet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Select extends AppCompatActivity {
    Button TextS, SpeechT, Game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        TextS=findViewById(R.id.textspeech);
        SpeechT=findViewById(R.id.speechtext);
        Game=findViewById(R.id.game);
        TextS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),learn.class);
                startActivity(i);
            }
        });
        SpeechT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Select.this,exam.class);
                startActivity(i);
            }
        });
        Game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Select.this,play.class);
                startActivity(i);
            }
        });
    }


    @Override
    public void onBackPressed() {
        //remove super.method
        new AlertDialog.Builder(Select.this).setIcon(R.mipmap.ic_launcher)
                .setTitle("game")
                .setMessage("Do you want to exit App?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }).setNegativeButton("No", null).show();
    }

}
