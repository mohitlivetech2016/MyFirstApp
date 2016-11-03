package com.example.android.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {




    public TextView getmTv_DisplayValue() {
        return mTv_DisplayValue;
    }

    public void setmTv_DisplayValue(TextView mTv_DisplayValue) {
        this.mTv_DisplayValue = mTv_DisplayValue;
    }

    public EditText getmEt_Value1() {
        return mEt_Value1;
    }

    public void setmEt_Value1(EditText mEt_Value1) {
        this.mEt_Value1 = mEt_Value1;
    }

    public EditText getmEt_Value2() {
        return mEt_Value2;
    }

    public void setmEt_Value2(EditText mEt_Value2) {
        this.mEt_Value2 = mEt_Value2;
    }

    public Button getmBtn_Add() {
        return mBtn_Add;
    }

    public void setmBtn_Add(Button mBtn_Add) {
        this.mBtn_Add = mBtn_Add;
    }

    private EditText mEt_Value1,mEt_Value2;
    private Button  mBtn_Add;
    private TextView mTv_DisplayValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

    mEt_Value1=(EditText)findViewById(R.id.idEtValue1);
        mEt_Value2=(EditText)findViewById(R.id.idEtValue2);
        mTv_DisplayValue=(TextView)findViewById(R.id.idTv_display);
        mBtn_Add=(Button)findViewById(R.id.idBtn_Add);


        mBtn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int add=Integer.parseInt(mEt_Value1.getText().toString())+Integer.parseInt(mEt_Value2.getText().toString());
                    mTv_DisplayValue.setText(add);

            }
        });




    }



}
