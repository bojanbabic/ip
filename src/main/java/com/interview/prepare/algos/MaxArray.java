package com.interview.prepare.algos;

import java.util.Arrays;

public class MaxArray {

// Given an array containing integers which are initially increasing to a peak and then
// decreasing after the peak, return the peak value.
// INPUT: [1, 3, 5, 7, 9, 4, 2]
// OUTPUT: = 7

// INPUT1: [1, 3, 4, 5, 6, 7, 5] // increasing both subarrays
// INPUT2: [1, 3, 7, 0, -1, -2] // increasing left decreasing right
// INPUT3: [5, 6, 5]

    public int split(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int mid_i = arr.length / 2;
        int left = arr[mid_i - 1];
        int right = arr[mid_i + 1];
        int mid = arr[mid_i];
        if (left < mid && right < mid) {
            return mid;
        } else if (left < mid && mid < right) {
            return split(Arrays.copyOfRange(arr, mid_i + 1, arr.length));
        } else {
            return split(Arrays.copyOfRange(arr, 0, mid_i));
        }
    }

}
