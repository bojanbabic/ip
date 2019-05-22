package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertSearchPositionTest {

    @Test
    public void getPosition() {
        InsertSearchPosition isp = new InsertSearchPosition();
        int[] a = {1, 3, 5, 6};
        assertEquals(2, isp.getPosition(a, 5));
        assertEquals(1, isp.getPosition(a, 2));
        assertEquals(0, isp.getPosition(a, 0));
        assertEquals(4, isp.getPosition(a, 7));
    }
}