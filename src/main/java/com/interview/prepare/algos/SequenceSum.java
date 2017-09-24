package com.interview.prepare.algos;

/**
 *  Created by bojan on 2/24/17.
    https://leetcode.com/problems/maximum-subarray/#/solutions
    TODO run all the tests
 */
public class SequenceSum {
    public int maxSubArray(int[] array) {
        int currentMax = Integer.MIN_VALUE;
        int currentMin = Integer.MAX_VALUE;
        int currentSum = 0;
        if (array.length == 1) return array[0];
        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            if (currentSum < currentMin) {
                currentMin = currentSum;
            }
            if (currentSum - currentMin > currentMax) {
                currentMax = currentSum - currentMin;
            }
        }
        return currentMax;
    }
}
