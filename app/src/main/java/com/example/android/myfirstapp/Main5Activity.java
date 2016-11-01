package com.example.android.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    public TextView getmTv_View1() {
        return mTv_View1;
    }

    public void setmTv_View1(TextView mTv_View1) {
        this.mTv_View1 = mTv_View1;
    }

    public TextView getmTv_View2() {
        return mTv_View2;
    }

    public void setmTv_View2(TextView mTv_View2) {
        this.mTv_View2 = mTv_View2;
    }


    private TextView mTv_View1;
    private TextView mTv_View2;

    //int a,c,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Bundle b = getIntent().getExtras();
        mTv_View1 = (TextView) findViewById(R.id.idTv_View1);
        mTv_View2 = (TextView) findViewById(R.id.idTv_View2);

        //  val1.setText(b.getCharSequence("value1"));
        // val2.setText(b.getCharSequence("value2"));
        //  a = Integer.valueOf((String) (b.getCharSequence("value1")));
        // c = Integer.valueOf((String) (b.getCharSequence("value2")));
    }
}
