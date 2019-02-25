package com.interview.cruise.prepare;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMaxDiffTest {
    ArrayDiff diff = new ArrayDiff();

    @Test
    public void maxDiff() {
        int[] a = {3, 4, 5, 6};
        assertEquals(3, diff.maxDiff(a));
    }

    @Test
    public void minDiff() {
        int[] a1 = {3, 4, 5, 6};
        assertEquals(1, diff.minDiff(a1));
        int[] a2 = {3, -7, 0};
        assertEquals(3, diff.minDiff(a2));
    }
}