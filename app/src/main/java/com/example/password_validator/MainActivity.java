package com.example.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static boolean notEqualPassword(String password){
        boolean NotEqualPassword = false;
        if(!password.toLowerCase().equals("password"))
            NotEqualPassword = true;
        return NotEqualPassword;
    }
    public static boolean atLeastEight(String password){
        boolean atLeastEight = false;
        if(password.length()>=8)
            atLeastEight = true;
        return atLeastEight;

    }
}
