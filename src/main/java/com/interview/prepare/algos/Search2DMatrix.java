package com.interview.prepare.algos;

/**
 * https://www.programcreek.com/2014/04/leetcode-search-a-2d-matrix-ii-java/
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 */
public class Search2DMatrix {
    public boolean search(int[][] mx, int x) {
        int m = mx.length - 1;
        int n = mx[0].length - 1;

        int i = m;
        int j = 0;

        while (i >= 0 && j <= n) {
            if (mx[i][j] < x) {
                j++;
            } else if (mx[i][j] > x) {
                i--;
            } else {
                return true;
            }
        }
        return false;
    }
}
