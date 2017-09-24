package com.interview.prepare.sort;

/**
 * Created by bojan on 2/21/17.
 */
public class QuickSelect {

    private int partition(int[] a, int start, int end) {
        int pivot = a[end];
        int i = start; int j = end;
        while (i < j) {
            while (a[i] < pivot) i++;
            while (pivot < a[j]) j--;
            swap(a, i, j);
        }
        return i;
    }


    public int find(int arr[], int l, int r, int k) {
        if (k < 0 || k > r - l + 1) {
            return Integer.MAX_VALUE;
        }
        int pos = partition(arr, l, r);
        if (pos - l == k - 1)
            return arr[pos];
        if (pos - l > k - 1)
            return find(arr, l, pos - 1, k);
        return find(arr, pos + 1, r, k - pos + l - 1);
    }

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
