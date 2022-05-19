package com.example.mar_4pageact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EducationalBackground extends AppCompatActivity {
    EditText elementary,elem_year,highschool,hs_year,college;
    Button next,back;
    String elemstr,elemyearstr,highschoolstr, hsyearstr,collegestr;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_background);

        sp = getSharedPreferences("EducationalBackground", Context.MODE_PRIVATE);
        elementary = (EditText) findViewById(R.id.elementaryEditText);
        elem_year = (EditText) findViewById(R.id.elemyearEditText);
        highschool = (EditText) findViewById(R.id.highschoolEditText);
        hs_year = (EditText) findViewById(R.id.hsyearEditText);
        college = (EditText) findViewById(R.id.collegeEditText);
        next = (Button) findViewById(R.id.NextButton2);
        back = (Button) findViewById(R.id.BackButton);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                elemstr = elementary.getText().toString();
                elemyearstr = elem_year.getText().toString();
                highschoolstr = highschool.getText().toString();
                hsyearstr = hs_year.getText().toString();
                collegestr = college.getText().toString();

                SharedPreferences.Editor editor = sp.edit();
                editor.putString("elementary", elemstr);
                editor.putString("elem_year", elemyearstr);
                editor.putString("highschool",highschoolstr);
                editor.putString("hsyear",hsyearstr);
                editor.putString("college",collegestr);
                editor.commit();
                transfer();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfer2();
            }
        });
    }

    public void transfer(){
        Intent intent = new Intent(this,Skills.class);
        startActivity(intent);
    }
    public void transfer2(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}