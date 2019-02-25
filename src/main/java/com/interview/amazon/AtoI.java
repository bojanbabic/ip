package com.interview.amazon;

import com.google.common.primitives.Chars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        ACCEPTED_CHARS.add('-');
    }

    public int myAtoi(String str) {
        int start = 0;
        int sign = 1;
        if (str.length() == 0) {
            return 0;
        }

        while (start < str.length() && str.charAt(start) == ' ') {
            start = start + 1;
        }

        if (str.charAt(start) == '-') {
            sign = -1;
            start = 1;
        }

        if (sign == -1 && str.length() == 1) {
            return 0;
        }

        if (start == str.length()) {
            return 0;
        }

        if (!ACCEPTED_CHARS.contains(str.charAt(start))) {
            return 0;
        }
        int res = 0;
        for (int i = start; i < str.toCharArray().length; i++) {
            if (!ACCEPTED_CHARS.contains(str.charAt(i))) {
                continue;
            }
            res = res * 10 + Character.getNumericValue(str.charAt(i));
            if (res > Integer.MAX_VALUE / 10) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
        }
        return sign * res;
    }
}
