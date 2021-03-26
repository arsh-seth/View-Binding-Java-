package com.example.viewbindingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String Tag= "BTN";
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(Tag,"SECOND BUTTON");
            }
        });
        btn3.setOnClickListener(this);
    }

    public void oncl (View v){

        Log.d(Tag, "ButtonClicked1");
    }

    @Override
    public void onClick(View v) {
        Log.d(Tag, "ButtonClicked3");
    }
}