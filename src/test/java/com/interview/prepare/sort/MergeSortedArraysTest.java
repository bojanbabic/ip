package com.interview.prepare.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 2/21/17.
 */
public class MergeSortedArraysTest {
    MergeSortedArrays ma = new MergeSortedArrays();
    @Test
    public void mergeArrays() throws Exception {
        int[] a = {1,3,5,7};
        int[] b = {2,4,6,8};
        int[] c = {1,2,3,4,5,6,7,8};
        assertEquals(c, ma.mergeArrays(a, b));
    }

    @Test
    public void mergeSort() throws Exception {
        int[] a = {1,3,5,7,0,0,0};
        int[] b = {4,6,8};
        int[] c = {1,3,4,5,6,7,8};
        assertArrayEquals(c, ma.mergeSort(a, b, 4, 3));
    }

}