package com.interview.prepare.datastructures;

/**
 * Created by bojan on 3/25/17.
 */
public class LargestRegion {
    private boolean[][] processed;
    private int[][] grid;
    int n;
    int m;

    public LargestRegion(int n, int m, int[][] grid) {
        this.n = n;
        this.m = m;
        this.grid = grid;
        this.processed = new boolean[n][m];
    }

    public int getLargestRegion(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
               count = Math.max(count, countConnected(i, j));
            }
        }
        return count;
    }

    private int countConnected(int i, int j) {
        int cnt = 0;
        if (i < 0 || j < 0 || i > n || j > m) return cnt;
        if (processed[i][j]) return cnt;
        if (grid[i][j] == 1) cnt++;
        else return cnt;
        processed[i][j] = true;
        cnt += countConnected(i + 1, j);
        cnt += countConnected(i + 1, j + 1);
        cnt += countConnected(i, j + 1);
        cnt += countConnected(i - 1, j + 1);
        cnt += countConnected(i - 1, j);
        cnt += countConnected(i - 1, j - 1);
        cnt += countConnected(i, j - 1);
        cnt += countConnected(i + 1, j - 1);
        return cnt;
    }
}
