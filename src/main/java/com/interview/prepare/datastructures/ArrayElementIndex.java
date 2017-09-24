package com.interview.prepare.datastructures;

/**
 * Created by bojan on 6/13/17.
 */
public class ArrayElementIndex {
    public int findIndex(int[] nums, int target) {
        int i = 0;
        int j = nums.length;
        int mid = j / 2;
        while (i < j) {
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                j = mid;
            } else {
                i = mid;
            }
        }
        return i;
    }
}
