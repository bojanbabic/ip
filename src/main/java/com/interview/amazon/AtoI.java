package com.interview.amazon;

import java.util.ArrayList;
import java.util.List;

public class AtoI {
    static List<Character> ACCEPTED_CHARS = new ArrayList<>();
    static {
        ACCEPTED_CHARS.add('0');
        ACCEPTED_CHARS.add('1');
        ACCEPTED_CHARS.add('2');
        ACCEPTED_CHARS.add('3');
        ACCEPTED_CHARS.add('4');
        ACCEPTED_CHARS.add('5');
        ACCEPTED_CHARS.add('6');
        ACCEPTED_CHARS.add('7');
        ACCEPTED_CHARS.add('8');
        ACCEPTED_CHARS.add('9');
    }
    static List<Character> SPECIAL_CHARS = new ArrayList<>();
    static {
        SPECIAL_CHARS.add('-');
        SPECIAL_CHARS.add('+');
    }

    public int myAtoi(String str) {
        int start = 0;
        int sign = 1;
        boolean special = false;
        if (str.length() == 0) {
            return 0;
        }

        if (str.length() == 1 && SPECIAL_CHARS.contains(str.charAt(start))) {
            return 0;
        }

        while (start < str.length() && str.charAt(start) == ' ') {
            start = start + 1;
        }

        if (start == str.length()) {
            return 0;
        }

        if (str.charAt(start) == '-') {
            sign = -1;
            start = start + 1;
            special = true;
            if (!ACCEPTED_CHARS.contains(str.charAt(start))) {
                return 0;
            }
        }

        if (str.charAt(start) == '+') {
            sign = 1;
            start = start + 1;
            special = true;
            if (!ACCEPTED_CHARS.contains(str.charAt(start))) {
                return 0;
            }
        }

        if (!ACCEPTED_CHARS.contains(str.charAt(start))) {
            return 0;
        }
        long res = 0;
        for (int i = start; i < str.toCharArray().length; i++) {
            if (!ACCEPTED_CHARS.contains(str.charAt(i))) {
                break;
            }
            res = res * 10l;
            res = res + Character.getNumericValue(str.charAt(i));
            if (sign * res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        res = sign * res;
        return (int) res;
    }
}
