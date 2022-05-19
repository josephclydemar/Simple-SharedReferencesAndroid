package com.example.mar_4pageact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Skills extends AppCompatActivity {
    EditText s1,s2,s3,s4,s5;
    Button next,back;
    String s1str,s2str,s3str,s4str,s5str;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        sp = getSharedPreferences("Skills", Context.MODE_PRIVATE);

        s1 = (EditText) findViewById(R.id.s1EditText);
        s2 = (EditText) findViewById(R.id.s2EditText);
        s3 = (EditText) findViewById(R.id.s3EditText);
        s4 = (EditText) findViewById(R.id.s4EditText);
        s5 = (EditText) findViewById(R.id.s5EditText);
        next = (Button) findViewById(R.id.NextButton3);
        back = (Button) findViewById(R.id.BackButton2);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1str = s1.getText().toString();
                s2str = s2.getText().toString();
                s3str = s3.getText().toString();
                s4str = s4.getText().toString();
                s5str = s5.getText().toString();

                SharedPreferences.Editor editor = sp.edit();
                editor.putString("s1", s1str);
                editor.putString("s2",s2str);
                editor.putString("s3",s3str);
                editor.putString("s4", s4str);
                editor.putString("s5",s5str);
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
        Intent intent = new Intent(this,Summary.class);
        startActivity(intent);
    }

    public void transfer2(){
        Intent intent = new Intent(this,EducationalBackground.class);
        startActivity(intent);
    }
}