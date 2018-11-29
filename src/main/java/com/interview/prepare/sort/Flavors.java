package com.interview.prepare.sort;

/**
 * Created by bbabic on 10/20/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Flavors {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int trips = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int i = 0;
        String flavors = "";
        while (m > 0 && i < arr.length) {
            flavors = arr[i] + " ";
            m = m - arr[i];
        }
        System.out.println(flavors);
    }
}
