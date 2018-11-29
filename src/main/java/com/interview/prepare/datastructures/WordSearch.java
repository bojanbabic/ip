package com.interview.prepare.datastructures;

/**
 * Uber interview
 * https://www.programcreek.com/2014/06/leetcode-word-search-java/
 * [
 *   ["ABCE"],
 *   ["SFCS"],
 *   ["ADEE"]
 * ]
 *
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 */
public class WordSearch {
    public boolean search(char[][] grid, String word) {
        boolean found;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == word.charAt(0)) {
                    found = dfs(grid, word, i, j);
                    if (found) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] grid, String str, int i, int j) {
        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1) {
            return false;
        }
        if (str.length() == 0) {
            return true;
        }
        if (grid[i][j] == str.charAt(0)) {
            char tmp = grid[i][j];
            grid[i][j] = '#';
            boolean found = dfs(grid, str.substring(1), i + 1, j) ||
                    dfs(grid, str.substring(1), i, j + 1) ||
                    dfs(grid, str.substring(1), i - 1, j) ||
                    dfs(grid, str.substring(1), i, j - 1);
            grid[i][j] = tmp;
            return found;
        } else {
            return false;
        }
    }
}
