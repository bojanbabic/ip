package com.interview.cruise.prepare;

import java.util.Arrays;

public class ArrayDiff {
    public int maxDiff(int[] array) {
        int maxElem = Integer.MIN_VALUE;
        int minElem = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElem) {
                maxElem = array[i];
            }
            if (array[i] < minElem) {
                minElem = array[i];
            }
        }
        return maxElem - minElem;
    }

    public int minDiff(int[] array) {
        Arrays.sort(array);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            int diff = array[i] - array[i - 1];
            if (diff < minDiff) minDiff = diff;
        }
        return minDiff;
    }
}
