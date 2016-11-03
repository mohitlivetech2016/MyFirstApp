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

    public Button getmBtn_PassValue() {
        return mBtn_PassValue;
    }

    public void setmBtn_PassValue(Button mBtn_PassValue) {
        this.mBtn_PassValue = mBtn_PassValue;
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


    public Button getmBtncalculate() {
        return mBtncalculate;
    }

    public void setmBtncalculate(Button mBtncalculate) {
        this.mBtncalculate = mBtncalculate;
    }

    public EditText getmEtInsertValue1() {
        return mEtInsertValue1;
    }

    public void setmEtInsertValue1(EditText mEtInsertValue1) {
        this.mEtInsertValue1 = mEtInsertValue1;
    }

    public EditText getmEtInsertValue2() {
        return mEtInsertValue2;
    }

    public void setmEtInsertValue2(EditText mEtInsertValue2) {
        this.mEtInsertValue2 = mEtInsertValue2;
    }

    public TextView getmTvDisplay() {
        return mTvDisplay;
    }

    public void setmTvDisplay(TextView mTvDisplay) {
        this.mTvDisplay = mTvDisplay;
    }

    private Button mBtncalculate;
    private EditText mEtInsertValue1;
    private EditText mEtInsertValue2;
    private TextView mTvDisplay;
    private Button mBtnTvDisplay;
    private Button mBtnNewLout;
    private Button mBtn_PassValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtncalculate =(Button)findViewById(R.id.idBtn_calculator);
        mBtnTvDisplay = (Button) findViewById(R.id.idBtnTvShow);
        mTvDisplay = (TextView) findViewById(R.id.idTvDisplay);
        mBtnNewLout = (Button) findViewById(R.id.idBtnNewLout);
        mEtInsertValue1 = (EditText) findViewById(R.id.idEtInsertValue1);
        mEtInsertValue2 = (EditText) findViewById(R.id.idEtInsertValue2);
        mBtn_PassValue = (Button) findViewById(R.id.idBtnCalc);
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

        mBtn_PassValue.setOnClickListener(new View.OnClickListener() {
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

        mBtncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(intent);

            }
        });

    }

}




