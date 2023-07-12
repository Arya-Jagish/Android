package com.example.loanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.et1);
        e2=(EditText) findViewById(R.id.et2);
        e3=(EditText) findViewById(R.id.et3);
        b=(Button) findViewById(R.id.button);
        t=(TextView) findViewById(R.id.textView);

    }
    public void onCalculate(View v){
        int l,interest,n;
        l=Integer.parseInt(e1.getText().toString());
        interest=Integer.parseInt(e2.getText().toString());
        n=Integer.parseInt(e3.getText().toString());

        for(int i=1;i<=n;i++){
            System.out.println("Year is"+i);
            l=((l*interest)/100)+l;
        }
        t.setText("Result is:"+l);


    }
}