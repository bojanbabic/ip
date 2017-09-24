package com.interview.prepare.sort;

/**
 * Created by bojan on 2/21/17.
 */
public class MergeSortedArrays {

    // naive
    public int[] mergeArrays(int[] a, int[] b) {
        int[] out = new int[a.length + b.length];
        int k = 0;
        int tmpa = 0;
        int tmpb = 0;
        for (int i = tmpa; i < a.length; i++) {
            for (int j = tmpb; j < b.length; j++) {
                if (b[j] < a[i]) {
                    out[k++] = b[j];
                    tmpb++;
                } else {
                    out[k++] = a[i];
                    tmpa++;
                    break;
                }
            }
        }
        if (tmpa < a.length) {
            while (tmpa < a.length) out[k++] = a[tmpa++];
        }
        if (tmpb < b.length) {
            while (tmpb < b.length) out[k++] = b[tmpb++];
        }
        return out;
    }

    // merge sort
    public int[] mergeSort(int[] a, int[] b, int n, int m) {
        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                a[k--] = a[i--];
            } else {
                a[k--] = b[j--];
            }
        }
        while (j >= 0) a[k--] = b[j--];
        return a;
    }
}
