package com.example.android.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {


    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b2=(Button)findViewById(R.id.main_button);
         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


        Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
       startActivity(intent);

             }
         });
    }

}
