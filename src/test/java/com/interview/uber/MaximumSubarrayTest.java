package com.interview.uber;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {

    @Test
    public void maxSubArray() {
        MaximumSubarray ms = new MaximumSubarray();
        int[] subarary = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, ms.maxSubArray(subarary));
    }
}