package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        number=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
    }
    public void go(View view){
        if (number <6) {
            btn.setText("THIS IS A CLICK NUMBER:" + number);
            number += 1;
        }
        else{
            btn.setText("Enough to click, go to new start!" );
            number=0;
        }
    }
}