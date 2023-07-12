package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3;
    EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox) findViewById(R.id.c1);
        c2=(CheckBox) findViewById(R.id.c2);
        c3=(CheckBox) findViewById(R.id.c3);
        t1=(EditText) findViewById(R.id.t1);
    }
    public void OnSslc(View v){
        String str="SSLC";
        if(c1.isChecked()){
            c1.setChecked(true);
            t1.setText(str);
        }
        else if(c1.isChecked()==false){
            c2.setChecked(false);
            c3.setChecked(false);
        }
    }
    public void OnPlusTwo(View v){
        String str="";
        if(c2.isChecked()){
            c1.setChecked(true);
            t1.setText("SSLC,PLUS TWO");
        }
        else if(c2.isChecked()==false){
            c3.setChecked(false);
        }

    }
    public void OnUg(View v){
        String str="";
        if(c3.isChecked()){
            c3.setChecked(true);
            t1.setText("SSLC,PLUS TWO,UG");
        }
        else if(c3.isChecked()==false){
            c1.setChecked(true);
            c2.setChecked(true);
        }


    }

}