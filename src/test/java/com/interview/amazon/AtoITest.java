package com.interview.amazon;

import org.junit.Test;

import static org.junit.Assert.*;

public class AtoITest {

    @Test
    public void myAtoi() {
        AtoI atoI = new AtoI();
//        assertEquals(42, atoI.myAtoi("42"));
//        assertEquals(-42, atoI.myAtoi("-42"));
//        assertEquals(-42, atoI.myAtoi(" -42"));
//        assertEquals(4193, atoI.myAtoi("4193 with words"));
//        assertEquals(0, atoI.myAtoi("words and 987"));
//        assertEquals(0, atoI.myAtoi("words and 987"));
//        assertEquals(-2147483648, atoI.myAtoi("-91283472332"));
        assertEquals(2147483647, atoI.myAtoi("9223372036854775808"));
    }
}