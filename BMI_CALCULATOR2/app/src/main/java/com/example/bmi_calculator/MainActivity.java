package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText heightEt,weightEt;
    RadioGroup genderRg;
    Button btn;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heightEt = findViewById(R.id.height_et);
        weightEt = findViewById(R.id.weight_et);
        btn=findViewById(R.id.bml_btn);
        genderRg=findViewById(R.id.gender_Rg);


        genderRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.boy_rb){
                    gender="boy";
                }else{
                    gender="girl";
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightVal=heightEt.getText().toString().trim();
                String weightVal=weightEt.getText().toString().trim();

                float height=Float.parseFloat(heightVal);
                float weight=Float.parseFloat(weightVal);
                float bmi=calBMI(height,weight);

//                Toast.makeText(MainActivity.this, String.valueOf(bmi) + " "+gender, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("bmi",bmi);
                intent.putExtra("gender",gender);
                startActivity(intent);


            }
        });

    }
    public float calBMI(float h,float w){
        float bmi=0;
        float h_m=h/100;
        bmi=w/(h_m*h_m);
        return bmi;
    }
}