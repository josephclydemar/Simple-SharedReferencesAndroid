package com.example.mar_4pageact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {
   TextView fullname,bday,gender,elem,hs,college,s1,s2,s3,s4,s5;

    SharedPreferences sp1, sp2,sp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        String fnamestr, mnamestr, lnamestr,bdaystr,genderstr,elemstr, elemyearstr,hsstr, hsyearstr,collegestr, collegeyearstr,s1str,s2str,s3str,s4str,s5str;
        fullname = (TextView) findViewById(R.id.fullname);
        bday = (TextView) findViewById(R.id.birthdate);
        gender = (TextView) findViewById(R.id.gender);
        elem = (TextView) findViewById(R.id.elementary);
        hs = (TextView) findViewById(R.id.highschool);
        college = (TextView) findViewById(R.id.college);
        s1 = (TextView) findViewById(R.id.s1);
        s2 = (TextView) findViewById(R.id.s2);
        s3 = (TextView) findViewById(R.id.s3);
        s4 = (TextView) findViewById(R.id.s4);
        s5 = (TextView) findViewById(R.id.s5);

        sp1 = getApplicationContext().getSharedPreferences("Personal_Info", Context.MODE_PRIVATE);
        sp2 = getApplicationContext().getSharedPreferences("EducationalBackground", Context.MODE_PRIVATE);
        sp3 = getApplicationContext().getSharedPreferences("Skills", Context.MODE_PRIVATE);

        fnamestr = sp1.getString("firstname","");
        mnamestr = sp1.getString("middlename","");
        lnamestr = sp1.getString("lastname","");
        bdaystr = sp1.getString("birthday","");
        genderstr = sp1.getString("gender","");

        elemstr = sp2.getString("elementary","");
        elemyearstr = sp2.getString("elem_year","");
        hsstr = sp2.getString("highschool","");
        hsyearstr = sp2.getString("hsyear","");
        collegestr = sp2.getString("college","");

        s1str = sp3.getString("s1","");
        s2str = sp3.getString("s2","");
        s3str = sp3.getString("s3","");
        s4str = sp3.getString("s4","");
        s5str = sp3.getString("s5","");

        System.out.println(fnamestr);

        fullname.setText(fnamestr + " " + mnamestr + " " + lnamestr );
        bday.setText(bdaystr);
        gender.setText(genderstr);
        elem.setText(elemstr +", " + elemyearstr);
        hs.setText(hsstr + ", " + hsyearstr);
        college.setText(collegestr + ", " + "Present");
        s1.setText(s1str);
        s2.setText(s2str);
        s3.setText(s3str);
        s4.setText(s4str);
        s5.setText(s5str);







    }
}