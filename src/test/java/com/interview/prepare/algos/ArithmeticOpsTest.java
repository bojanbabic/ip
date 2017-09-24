package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 4/8/17.
 */
public class ArithmeticOpsTest {
    ArithmeticOps a = new ArithmeticOps();
    @Test
    public void multiply() throws Exception {
        assertEquals("540", a.multiply("45", "12"));
        assertEquals("0", a.multiply("0", "0"));
    }

    @Test
    public void power() {
        assertEquals(4, a.power(2, 2));
        assertEquals(256, a.power(2, 8));
    }

    @Test
    public void divide() {
        assertEquals(2147483647l, a.divide(-2147483648, -1));
        assertEquals(-1, a.divide(-1, 1));

    }

}