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
            while (array[i] < pivot) {
                i++;
            }
            while (pivot < array[j]) {
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

    public void quickSortFirstPivot(int[] ar, int left, int right) {
        int i = left + 1, j = right;
        int pivot = ar[left];
        while (i <= j) {
            while (i < ar.length && ar[i] < pivot) {
                i++;
            }
            while (ar[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int tmp = ar[i];
                ar[i] = ar[j];
                ar[j] = tmp;
                i++;
                j--;
            }
        }
        if (left > j) return;
        int tmp = ar[left];
        ar[left] = ar[j];
        ar[j] = tmp;
        if (left < j) {
            quickSortFirstPivot(ar, left, j);
        }
        if (j < right) {
            quickSortFirstPivot(ar, j + 1, right);
        }
    }
}
