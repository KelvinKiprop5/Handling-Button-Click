package com.example.kevoh3.addlingbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button) findViewById(R.id.btnClick);

        myButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.tvText);
                textView.setText("You clicked the button");
            }

        });
        myButton.setOnLongClickListener(new Button.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                TextView textView = (TextView) findViewById(R.id.tvText);
                textView.setText("You Long Clicked the button");
                return true;
            }
        });

    }
}