package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxArrayTest {

    @Test
    public void split() {

        int[] arr1  = {5, 6, 5};
        MaxArray ma = new MaxArray();
        assertEquals(6, ma.split(arr1));

        int[] arr2 = {1, 3, 4, 5, 6, 7, 5};
        assertEquals(7, ma.split(arr2));

        int[] arr3 = {1, 3, 5, 7, 9, 4, 2};
        assertEquals(9, ma.split(arr3));

        int[] arr4 = {1, 3, 7, 0, -1, -2};
        assertEquals(7, ma.split(arr4));
    }
}