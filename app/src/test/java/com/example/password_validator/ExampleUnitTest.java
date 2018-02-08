package com.example.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.example.password_validator.MainActivity.atLeastOneDigit;
import static com.example.password_validator.MainActivity.LowerAndUpper;
import static com.example.password_validator.MainActivity.atLeastOneSpecialChar;



/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void atLeast_OneDigit() throws Exception{
        String pwd = "HelloWorld1";
        boolean atLeastOneDigit = atLeastOneDigit(pwd);
        assertTrue(atLeastOneDigit);
    }
    @Test
    public void lowerAndUpper() throws Exception{
        String pwd = "HelloWorld";
        boolean lowerAndUpper = LowerAndUpper(pwd);
        assertTrue(lowerAndUpper);
    }
    @Test
    public void specialChar() throws Exception{
        String pwd = "HelloWorld@";
        boolean specialChar = atLeastOneSpecialChar(pwd);
        assertTrue(specialChar);
    }
}
