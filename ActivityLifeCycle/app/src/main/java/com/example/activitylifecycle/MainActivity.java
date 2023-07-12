package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyApp","onCreate()");
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d("MyApp","onStart()");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("MyApp","onStop()");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("MyApp","onPause()");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("MyApp","onDestroy()");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d("MyApp","onResume()");
    }



}