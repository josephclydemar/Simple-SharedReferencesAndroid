package com.example.mar_4pageact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstname,middlename,lastname,birthday,gender;
    String firstname_str,middlename_str,lastname_str,birthday_str,gender_str;
    Button next;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname = (EditText) findViewById(R.id.firstnameEditText);
        middlename = (EditText) findViewById(R.id.middlenameEditText);
        lastname = (EditText) findViewById(R.id.lastnameEditText);
        birthday = (EditText) findViewById(R.id.birthdayEditText);
        gender = (EditText) findViewById(R.id.genderEditText);
        next = (Button) findViewById(R.id.NextButton);






        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstname_str = firstname.getText().toString();
                middlename_str = middlename.getText().toString();
                lastname_str = lastname.getText().toString();
                birthday_str = birthday.getText().toString();
                gender_str = gender.getText().toString();

                sp = getSharedPreferences("Personal_Info", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("firstname",firstname_str);
                editor.putString("middlename", middlename_str);
                editor.putString("lastname",lastname_str);
                editor.putString("birthday", birthday_str);
                editor.putString("gender",gender_str);
                editor.commit();

                transfer();


            }
        });

    }

    public void transfer(){
        Intent intent = new Intent(this,EducationalBackground.class);
        startActivity(intent);
    }
}