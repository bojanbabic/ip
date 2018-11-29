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

    int editDistanceRecursive(char[] str1, char[] str2, int pos1, int pos2) {
        if (pos1 == str1.length) {
            return str2.length - pos2;
        }

        if (pos2 == str2.length) {
            return str1.length - pos1;
        }

        if (str1[pos1] == str2[pos2]) {
            return editDistanceRecursive(str1, str2, pos1 + 1, pos2 + 1);
        }
        return 1 + Math.min(editDistanceRecursive(str1, str2, pos1, pos2 + 1), // insert
                Math.min(editDistanceRecursive(str1, str2, pos1 + 1, pos2 + 1), // replace
                editDistanceRecursive(str1, str2, pos1 + 1, pos2)) // delete
        );
    }
}
