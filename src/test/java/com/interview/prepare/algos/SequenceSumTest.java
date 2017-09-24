package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 2/24/17.
 */
public class SequenceSumTest {
    SequenceSum ss = new SequenceSum();
    @Test
    public void maxSum() throws Exception {
        int[] a = {2, -8, 3, -2, 4, -10};
        assertEquals(5, ss.maxSubArray(a));
        int[] a1 = {1};
        assertEquals(1, ss.maxSubArray(a1));
        int[] a2 = {-1, -2};
        assertEquals(-1, ss.maxSubArray(a2));
    }

}