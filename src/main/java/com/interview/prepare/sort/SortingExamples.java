package com.interview.prepare.sort;

/**
 * Created by bojan on 2/15/17.
 */
public class SortingExamples {
    public boolean isTrue() {
        return true;
    }

    public int leftShift(int a) {
        return a << 1;
    }

    public int rightShift(int a) {
        return a >> 1;
    }

    public int[] swap(int[] a, int a1, int a2) {
        int x = a[a1];
        int y = a[a2];
        x ^= y;
        y ^= x;
        x ^= y;
        a[a1] = x;
        a[a2] = y;
//        a[a1] ^= a[a2];
//        a[a2] ^= a[a1];
//        a[a1] ^= a[a2];
        return a;
    }

    public void quickSort(int[] array, int left, int right) {
        int mid = rightShift(left + right);
        int pivot = array[mid];
        int i = left;
        int j = right;
        while (i <= j) {
            while (array[i] < array[pivot]) {
                i++;
            }
            while (array[pivot] < array[j]) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;j--;
            }
        }
        if (left < mid) {
            quickSort(array, left, mid);
        }
        if (mid < right) {
            quickSort(array, mid + 1, right);
        }
    }
}
