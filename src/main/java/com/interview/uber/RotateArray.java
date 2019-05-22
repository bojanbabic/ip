package com.interview.uber;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] begin = Arrays.copyOfRange(nums, 0, k);
        int[] end = Arrays.copyOfRange(nums, nums.length - k - 1, k);
        System.arraycopy(end, 0, nums, 0, k);
        System.arraycopy(begin, 0, nums, nums.length - k - 1, k);
    }
}
