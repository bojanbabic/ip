package com.interview.prepare.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bojan on 2/26/17.
 */
public class MedianHeapTest {
    MedianHeap mh = new MedianHeap();
    @Test
    public void getMedian() throws Exception {
        double[] expected = {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};
        for (int i = 1; i < 11; i++) {
            mh.addElement(i);
            assertEquals(expected[i - 1], mh.getMedian(), 0.0);
        }
        mh.reset();
        int[] a = {12, 4, 5, 3, 8, 7};
        double[] expected1 = {12.0, 8.0, 5.0, 4.5, 5.0, 6.0};
        for (int i = 0; i < 6; i++) {
            mh.addElement(a[i]);
            assertEquals(expected1[i], mh.getMedian(), 0.0);
        }
    }
}