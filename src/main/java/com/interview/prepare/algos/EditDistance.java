package com.interview.prepare.algos;

/**
 * Created by bojan on 4/4/17.
 */
public class EditDistance {
    int calculate(String s1, String s2) {
        if (s1.equals(s2)) {
            return 0;
        }
        if (s1.length() == 0 || s2.length() == 0) {
            return Math.max(s1.length(), s2.length());
        }
        int[][] matrix = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            matrix[i][0] = i;
        }
        for (int i = 0; i <= s2.length(); i++) {
            matrix[0][i] = i;
        }
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1];
                } else {
                    matrix[i][j] = Math.min(Math.min(matrix[i - 1][j] + 1, matrix[i][j - 1] + 1), matrix[i - 1][j - 1] + 1);
                }
            }
        }
        return matrix[s1.length()][s2.length()];

    }
}
