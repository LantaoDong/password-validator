package com.example.password_validator;

import org.junit.Test;
import static com.example.password_validator.MainActivity.notEqualPassword;
import static com.example.password_validator.MainActivity.atLeastEight;

import static org.junit.Assert.*;

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
    public void not_Password() throws Exception {
        String pwd = "HelloWorld";
        boolean notEqualPassword = notEqualPassword(pwd);
        assertTrue(notEqualPassword);
    }
    @Test
    public void AtLeastEight() throws Exception{
        String pwd = "HelloWorld";
        boolean atLeastEight = atLeastEight(pwd);
        assertTrue(atLeastEight);
    }
}