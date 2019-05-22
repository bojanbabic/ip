package com.interview.prepare.algos;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/
 */
public class MinInRotatedArray {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int res = findMinRec(nums, 0, nums.length - 1);
        if (res == -1) {
            return nums[0];
        } else {
            return res;
        }
    }

    private int findMinRec(int[] nums, int start, int end) {
        if (start >= end) {
            return -1;
        }
        int idx = (start + end) / 2;
        if (nums[idx] > nums[idx + 1]) {
            return nums[idx + 1];
        } else if (idx > 0 && nums[idx - 1] > nums[idx]) {
            return nums[idx];
        }
        if (nums[start] < nums[idx]) {
            return findMinRec(nums, idx + 1, end);
        } else {
            return findMinRec(nums, 0, idx - 1);
        }
    }
}
