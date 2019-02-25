package com.interview.lyft;

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int r = x % 10;
            x = x / 10;
            result = result * 10 + r;
            if (Math.abs(result) > Integer.MAX_VALUE / 10 && x != 0) {
                return 0;
            }
        }
        return result;
    }
}
