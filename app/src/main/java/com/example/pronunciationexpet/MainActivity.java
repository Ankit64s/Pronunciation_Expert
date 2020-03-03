package com.example.pronunciationexpet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


//to take time of 3 second
        int time=3000;

        //after 3 sec jump on the another activity
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //pass the operation and jump the next activity after 3 second
                Intent i= new Intent(MainActivity.this,Select.class);
                startActivity(i);
                finish();
            }
        },time);

    }
}
