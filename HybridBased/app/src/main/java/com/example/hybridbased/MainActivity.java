package com.example.hybridbased;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bPress;
        bPress = (Button) findViewById(R.id.b1);
        bPress.setOnClickListener(this);
    }
    public void onClick(View v) {
        Toast.makeText(this,"Welcome", Toast.LENGTH_LONG).show();
    }
}

