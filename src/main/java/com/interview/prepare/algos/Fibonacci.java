package com.interview.prepare.algos;

/**
 * Created by bojan on 3/26/17.
 */
public class Fibonacci {
    public int[] fibonacciIter(int n) {
        int[] a = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        return a;
    }
}
