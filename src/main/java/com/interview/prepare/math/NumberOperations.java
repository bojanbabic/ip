package com.interview.prepare.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bojan on 2/17/17.
 */
public class NumberOperations {
    public boolean isPrime(Integer n) {
        if (n < 2) return false;
        if (n == 2) return true;
        for (int i = 3; i < Math.sqrt(n); i = i + 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public List<Integer> findAllPrimesInefficient(Integer to) {
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 1; i < to; i++) {
            if (isPrime(i)) primes.add(i);
        }
        return primes;
    }

    public boolean[] findAllPrimesEfficient(Integer to) {
        boolean[] primes = new boolean[to + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        int n = (int) Math.sqrt(to);
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) continue;
            int k = i;
            while(k <= to) {
                primes[k] = false;
                k += i;
            }
        }
        System.out.println(Arrays.toString(primes));
        return primes;
    }

    public int greatestCommonDivisor(int a, int b) {
        for (int i = Math.min(a, b); i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
    /* Euclid algorithm:
        2336 = 1314 x 1 + 1022;
        1314 = 1022 x 1 + 292
        1022 = 292 x 3 + 146
        292 = 146 x 2 + 0
     */
    public int GCD(int a, int b) {
        int reminder = a % b;
        if (reminder == 0) return b;
        else
            return GCD(b, reminder);
    }

    public int toDecimal(String n, int b) {
        int dec = 0;
        int multiplier = 1;
        while (n.length() > 0) {
            int d = Integer.parseInt(n.charAt(n.length() - 1) + "");
            dec += d * multiplier;
            multiplier *= b;
            n = n.substring(0, n.length() - 1);
        }
        return dec;
    }

    public String fromDecimal(int n, int b) {
        StringBuilder s = new StringBuilder();
        String charMap = "0123456789ABCDEF";
        while (n > 0) {
            s.append(charMap.charAt(n % b));
            n /= b;
        }
        return s.reverse().toString();
    }
}
