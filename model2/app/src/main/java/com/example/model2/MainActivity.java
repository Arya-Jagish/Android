package com.example.model2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnAdd(View v){
        EditText e1,e2,e3;
        e1 =(EditText) findViewById(R.id.et1);
        e2 =(EditText) findViewById(R.id.et2);
        e3 =(EditText) findViewById(R.id.et3);
        int a,b,sum;
        a=Integer.parseInt(e1.getText().toString());
        b=Integer.parseInt(e2.getText().toString());
        sum=a+b;
        



    }
}