package com.example.cbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox) findViewById(R.id.c1);
        c2=(CheckBox) findViewById(R.id.c2);
        e1=(EditText) findViewById(R.id.e1);
    }
    public void OnSelect(View v){
        String str="";
        if(c1.isChecked()){
            str="UG";
        }
        if(c2.isChecked()){
            str="PG";
        }
        e1.setText(str);
    }
}