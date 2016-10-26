package com.example.android.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      Button button,button1;
        TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        button=(Button)findViewById(R.id.button);
        text=(TextView)findViewById(R.id.text1);
        button1=(Button)findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            text.setText(" Hello Sir :) ");

            }


        });


    }




}
