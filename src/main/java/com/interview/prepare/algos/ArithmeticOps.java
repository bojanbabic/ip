package com.interview.prepare.algos;

/**
 * https://leetcode.com/problems/multiply-strings
 * Created by bojan on 4/8/17.
 */
public class ArithmeticOps {
    public String multiply(String num1, String num2) {
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        int[] sum = new int[c1.length + c2.length];
        // chars in arrays are reversed
        for (int i = c1.length - 1; i >= 0; i--) {
            for (int j = c2.length - 1; j >= 0; j--) {
                int f = Integer.parseInt(c1[i] + "");
                int s = Integer.parseInt(c2[j] + "");
                int pos1 = i + j;
                int pos2 = i + j + 1;
                // sum[pos2] -> shift
                int tmp = f * s + sum[pos2];
                sum[pos1] += tmp / 10;
                sum[pos2] = tmp % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sum.length; i++) sb.append(sum[i]);
        return sb.toString();
    }

    public int power(int d, int p) {
        if (p == 0) return 1;
        return d * power(d, p - 1);
    }

    public int divide(int dividend, int divisor) {
        int sign = 1;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = -1;
        }
        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);
        if (dividendL < divisorL) {
            return 0;
        }
        long resultL = divideRec(dividendL, divisorL);
        int result;
        if (resultL > Integer.MAX_VALUE) {
            return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else if (resultL < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        result = (int) resultL;
        return result * sign;
    }

    private long divideRec(long dividendL, long divisorL) {
        if (dividendL < divisorL) return 0;
        long resultL = 1;
        long sum = divisorL;
        while ((sum + sum) <= dividendL) {
            sum += sum;
            resultL+=resultL;
        }
        return resultL + divideRec(dividendL - sum, divisorL);
    }
}
