package com.interview.prepare.sort;

import java.util.Arrays;

/**
 * Created by bojan on 3/26/17.
 * @since 1.6
 */
public class MergeSortImpl {

    public int[] merge(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        if (a.length == 1) {
            return a;
        }
        int mid = a.length/2;
        int[] left = merge(Arrays.copyOfRange(a, 0, mid));
        int[] right = merge(Arrays.copyOfRange(a, mid, a.length));
        int[] res = new int[a.length];
        int dPointer = 0; int lPointer = 0; int rPointer = 0;
        while(dPointer < a.length) {
            if (lPointer == left.length) {
                res[dPointer++] = right[rPointer++];
            } else if (rPointer == right.length) {
                res[dPointer++] = left[lPointer++];
            } else if (left[lPointer] < right[rPointer]) {
                res[dPointer++] = left[lPointer++];
            } else {
                res[dPointer++] = right[rPointer++];
            }
        }
        return res;
    }
}
