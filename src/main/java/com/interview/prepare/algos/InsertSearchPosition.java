package com.interview.prepare.algos;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class InsertSearchPosition {
    public int getPosition(int[] array, int value) {
        int prev = array[0];
        if (value <= prev) {
            return 0;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            } else if (array[i] > value &&
                    prev < value) {
                return i;
            }
        }
        return array.length;
    }
}
