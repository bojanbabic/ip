package com.interview.prepare.datastructures;

public class NumberOfIslands {
    public int count(int[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    markDfs(grid, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void markDfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return;
        }
        if (grid[i][j] == 0) {
            return;
        } else {
            grid[i][j] = 0;
            markDfs(grid, i + 1, j);
            markDfs(grid, i - 1, j);
            markDfs(grid, i, j + 1);
            markDfs(grid, i, j - 1);
        }
    }
}
