package com.interview.prepare.algos;

public class ReverseBits {
    public int reverse(int n) {
        int rev = 0;
        for (int i = 31; i >= 0; i--) {
            rev |= ((n&1)<<i);
            n = n >> 1;
        }
        return rev;
    }
}
