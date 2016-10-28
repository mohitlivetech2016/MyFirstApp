package com.example.android.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



    public class MainActivity extends AppCompatActivity {
        Button button,button1,button2;
        TextView text;
        EditText e1,e2;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button=(Button)findViewById(R.id.button);
            text=(TextView)findViewById(R.id.text1);
            button1=(Button)findViewById(R.id.button1);
            e1=(EditText)findViewById(R.id.text11);
            e2=(EditText)findViewById(R.id.text22);
            button2=(Button) findViewById(R.id.button2);
            button.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    text.setText(" Hello Sir :) ");

                }


            });

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(MainActivity.this,Main5Activity.class);
                    Bundle b = new Bundle();

                    //Inserts a String value into the mapping of this Bundle
                    b.putString("value1", e1.getText().toString());
                    b.putString("value2", e2.getText().toString());
                    intent.putExtras(b);
                    startActivity(intent);

                }
            });


        }



    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 =(Button)findViewById(R.id.main_button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                *//*Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.javatpoint.com"));
                startActivity(intent);*//*
                Intent toy=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(toy);

            }
        });*/


    }




