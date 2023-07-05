package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bPress,bCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bPress=new Button(this);
        bPress.setText("Press Me");
        LinearLayout lWindow=new LinearLayout(this);
        lWindow.setOrientation(LinearLayout.VERTICAL);
        lWindow.addView(bPress);

        bPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Welcome To Android", Toast.LENGTH_SHORT).show();
            }
        });

        bCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



        setContentView(lWindow);
//        setContentView(R.layout.activity_main);
    }
}