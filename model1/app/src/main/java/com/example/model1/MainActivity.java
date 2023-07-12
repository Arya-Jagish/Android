package com.example.model1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void OnSwap(View v){
            EditText e1,e2;
            e1 =(EditText) findViewById(R.id.et1);
            e2 =(EditText) findViewById(R.id.et2);
            String str1=e1.getText().toString();
            String str2=e2.getText().toString();
            if(str1==""||str2.length()==0){
                Toast.makeText(this,"Enter value", Toast.LENGTH_LONG).show();
            }
            else {
                e2.setText(str1);
                e2.setText(str2);
                e1.requestFocus();
            }

        }
}