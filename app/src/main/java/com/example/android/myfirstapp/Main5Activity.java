package com.example.android.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    int a,c,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        Bundle b = getIntent().getExtras();
        TextView val1 = (TextView) findViewById(R.id.textView3);
        TextView val2 = (TextView) findViewById(R.id.textView4);
        val1.setText(b.getCharSequence("value1"));
        val2.setText(b.getCharSequence("value2"));
        a = Integer.valueOf((String) (b.getCharSequence("value1")));
        c = Integer.valueOf((String) (b.getCharSequence("value2")));
    }
}
