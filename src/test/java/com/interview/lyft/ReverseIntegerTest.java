package com.interview.lyft;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void reverse() {
        ReverseInteger ri = new ReverseInteger();
        assertEquals(-123, ri.reverse(-321));
        assertEquals(-321, ri.reverse(-123));
        assertEquals(-12, ri.reverse(-21));
    }
}