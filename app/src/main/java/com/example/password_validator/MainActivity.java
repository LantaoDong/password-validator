package com.example.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //rule 1: it is not "password"
    public static boolean notEqualPassword(String password){
        boolean NotEqualPassword = false;
        if(!password.toLowerCase().equals("password"))
            NotEqualPassword = true;
        return NotEqualPassword;
    }
    //rule 2: at least 8 characters
    public static boolean atLeastEight(String password){
        boolean atLeastEight = false;
        if(password.length()>=8)
            atLeastEight = true;
        return atLeastEight;

    }
    //rule 3: contain at least one digit
    public static boolean atLeastOneDigit(String password){
        boolean AtLeastOneDigit = false;
        if(password.matches(".*[0-9].*"))
            AtLeastOneDigit = true;
        return AtLeastOneDigit;
    }
    //rule 4: contain both lower and upper case
    public static boolean LowerAndUpper(String password){
        boolean lowerAndUpper = false;
        if(password.matches("^(?=.*[a-z])(?=.*[A-Z]).+$"))
            lowerAndUpper = true;
        return lowerAndUpper;
    }
    //rule 5: contain at least one special character
    public static boolean atLeastOneSpecialChar(String password){
        boolean specialChar = false;
        if(password.matches("(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)"))
            specialChar = true;
        return specialChar;
    }

}
