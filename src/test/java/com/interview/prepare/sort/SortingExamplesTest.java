package com.interview.prepare.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 2/15/17.
 */

public class SortingExamplesTest {
    SortingExamples se = new SortingExamples();

    @Test
    public void isTrue() throws Exception {
        assertTrue(se.isTrue());
    }

    @Test
    public void leftShift() {
        assertEquals(6, se.leftShift(3));
    }

    @Test
    public void rightShift() {
//        assertEquals(2, se.rightShift(3));
//        assertEquals(4, se.rightShift(8));
        assertEquals(2, se.rightShift(4));
    }

    @Test
    public void swapTest() {
        int[] a = new int[]{0, 1, 2, 3};
        assertEquals(a[1], se.swap(a, 0, 1)[0]);
    }

    @Test
    public void quickSortTest() {
        int[] a = new int[]{3, 2, 1, 0};
        int[] e = new int[]{0, 1, 2, 3};
        se.quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            assertEquals(e[i], a[i]);
        }
    }
}