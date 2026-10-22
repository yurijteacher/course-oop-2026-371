package ua.com.kisit.unit4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyJUnitTest {

    @Test
    public void text1(){

        int a = 3;
        int b = 5;
        int c = 8;

        assertEquals(c,  a+b);



    }

}
