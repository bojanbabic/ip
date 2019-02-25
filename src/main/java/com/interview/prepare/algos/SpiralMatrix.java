package com.interview.prepare.algos;

public class SpiralMatrix {
    /**
     * [
     *  [ 1, 2, 3 ],
     *  [ 4, 5, 6 ],
     *  [ 7, 8, 9 ]
     * ]
     * @param mx
     * @return
     */
    public String printSpiralMatrix(int[][] mx) {
        StringBuilder sb = new StringBuilder();
        int borderL = 0;
        int borderT = 0;
        int borderB = mx.length - 1;
        int borderR = mx[0].length - 1;

        while (borderL <= borderR && borderB >= borderT) {
            // maxDiff right
            int i = borderL;
            int j = borderT;
            int m = borderB;
            int n = borderR;

            while (i <= borderR) {
                sb.append(mx[borderT][i++]);
            }
            borderT++;
            j++;
            if (borderT > mx.length - 1) break;

            while (j <= borderB) {
                sb.append(mx[j++][borderR]);
            }
            borderR--;
            m--;
            if (borderR < 0) break;

            while (m >= borderL) {
                sb.append(mx[borderB][m--]);
            }
            borderB--;
            n--;
            if (borderB < 0) break;

            while (n >= borderT) {
                sb.append(mx[n--][borderL]);
            }
            borderL++;
            if (borderL > mx[0].length - 1) break;
        }

        return sb.toString();
    }
}
