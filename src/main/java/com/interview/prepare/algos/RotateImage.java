package com.interview.prepare.algos;

/**
 *
 * https://leetcode.com/problems/rotate-image/
 *
 * [ 1, 2, 3, 4],
 * [ 5, 6, 7, 8],
 * [ 9,10,11,12]
 * [13,14,15,16]
 *
 * [13, 9, 5, 1],
 * [14,10, 6, 2],
 * [15,11, 7, 3]
 * [16,12, 8, 4]
 */
public class RotateImage {
    public int[][] rotate(int[][] img, int n) {
        int padding = 0;
        int max_n = n - padding;
        while (max_n > padding) {
            for (int i = padding; i < max_n - 1; i++) {
                int pos1 = img[padding][i];
                int pos2 = img[i][max_n - 1];
                int pos3 = img[max_n - 1][max_n - 1 - i];
                int pos4 = img[max_n - 1 - i][padding];
                int tmp = pos4;
                img[i][max_n - 1] = pos1;
                img[max_n - 1][max_n - 1 - i] = pos2;
                img[max_n - 1 - i][padding] = pos3;
                img[padding][i] = tmp;
            }
            padding++;
            max_n = n - padding;
        }
        return img;
    }
}
