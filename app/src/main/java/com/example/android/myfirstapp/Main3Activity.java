package com.example.android.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    public Button getmBtn_ClickRLayout() {
        return mBtn_ClickRLayout;
    }

    public void setmBtn_ClickRLayout(Button mBtn_ClickRLayout) {
        this.mBtn_ClickRLayout = mBtn_ClickRLayout;
    }

    private Button mBtn_ClickRLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        mBtn_ClickRLayout = (Button) findViewById(R.id.idBtn_ClickRLayout);

        mBtn_ClickRLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(intent);

            }
        });

    }
}
