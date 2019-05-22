package com.interview.uber;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        Integer sum = 0;
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
