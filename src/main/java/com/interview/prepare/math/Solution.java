package com.interview.prepare.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by bojan on 2/18/17.
 */

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] array = new long[n];
        long sum = 0;
        long max = 0;

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            long k = in.nextLong();
            array[a - 1] += k;
            if(b < n) array[b] -= k;
        }

        for (int i = 0; i < n; i++) {
            sum += array[i];
            max = sum > max ? sum : max;
        }

        System.out.println(max);
    }
}
