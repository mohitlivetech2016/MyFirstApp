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
    public Button getmBtnTvDisplay() {
        return mBtnTvDisplay;
    }

    public void setmBtnTvDisplay(Button mBtnEvDisplay) {
        this.mBtnTvDisplay = mBtnEvDisplay;
    }

    public Button getmBtnNewLout() {
        return mBtnNewLout;
    }

    public void setmBtnNewLout(Button mBtnNewLout) {
        this.mBtnNewLout = mBtnNewLout;
    }

    public Button getmBtnCalc() {
        return mBtnCalc;
    }

    public void setmBtnCalc(Button mBtnCalc) {
        this.mBtnCalc = mBtnCalc;
    }


    public EditText getmEvInsertValue1() {
        return mEtInsertValue1;
    }

    public void setmEvInsertValue1(EditText mEvValue1) {
        this.mEtInsertValue1 = mEvValue1;
    }

    public TextView getmTxtDisplay() {
        return mTvDisplay;
    }

    public void setmTxtDisplay(TextView mTxtDisplay) {
        this.mTvDisplay = mTxtDisplay;
    }

    public EditText getmEvInsertValue2() {
        return mEtInsertValue2;
    }

    public void setmEvInsertValue2(EditText mEvValue2) {
        this.mEtInsertValue2 = mEvValue2;
    }

    private EditText mEtInsertValue1;
    private EditText mEtInsertValue2;
    private TextView mTvDisplay;
    private Button mBtnTvDisplay;
    private Button mBtnNewLout;
    private Button mBtnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnTvDisplay = (Button) findViewById(R.id.idBtnTvShow);
        mTvDisplay = (TextView) findViewById(R.id.idTvDisplay);
        mBtnNewLout = (Button) findViewById(R.id.idBtnNewLout);
        mEtInsertValue1 = (EditText) findViewById(R.id.idEtInsertValue1);
        mEtInsertValue2 = (EditText) findViewById(R.id.idEtInsertValue2);
        mBtnCalc = (Button) findViewById(R.id.idBtnCalc);
        mBtnTvDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvDisplay.setText(" Hello Sir :) ");

            }


        });

        mBtnNewLout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        mBtnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main5Activity.class);
                Bundle b = new Bundle();

                //Inserts a String value into the mapping of this Bundle
                b.putString("value1", mEtInsertValue1.getText().toString());
                b.putString("value2", mEtInsertValue2.getText().toString());
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




