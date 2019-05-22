package com.interview.prepare.algos;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/length-of-last-word-in-a-string/
 */
public class LastWordLength {
    public int lastWorkLength(String s) {
        List<Character> c = new ArrayList<>();
        boolean isChar = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (isChar) return c.size();
            } else {
                isChar = true;
                c.add(s.charAt(i));
            }
        }
        return c.size();
    }
}
