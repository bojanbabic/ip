package com.interview.uber;

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int[][] updatedState = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                updatedState[i][j] = updateCell(board, i, j);
            }
        }
        System.arraycopy(updatedState, 0, board, 0, board.length);
    }

    private int updateCell(int[][] grid, int i, int j) {
        int[] neighour_values = new int[2];
        if (i < grid.length - 1) {
            neighour_values[grid[i + 1][j]]++;
        }
        if (i > 0) {
            neighour_values[grid[i - 1][j]]++;
        }
        if (j < grid[0].length - 1) {
            neighour_values[grid[i][j + 1]]++;
        }
        if (j > 0) {
            neighour_values[grid[i][j - 1]]++;
        }
        if (i < grid.length - 1 && j < grid[0].length - 1) {
            neighour_values[grid[i + 1][j + 1]]++;
        }
        if (i < grid.length - 1 && j > 0) {
            neighour_values[grid[i + 1][j - 1]]++;
        }
        if (i > 0 && j > 0) {
            neighour_values[grid[i - 1][j - 1]]++;
        }
        if (i > 0 && j < grid[0].length - 1) {
            neighour_values[grid[i - 1][j + 1]]++;
        }

        if (grid[i][j] == 1 && neighour_values[1] < 2) {
            return 0;
        }
        else if (grid[i][j] == 1 && neighour_values[1] <= 3) {
            return 1;
        } else if (grid[i][j] == 1 && neighour_values[1] > 3) {
            return 0;
        } else if (grid[i][j] == 0 && neighour_values[1] == 3) {
            return 1;
        }
        return 0;
    }
}
