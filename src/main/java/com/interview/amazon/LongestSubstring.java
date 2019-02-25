package com.interview.amazon;


import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String str) {
        int i = 0, j = 0;
        int maxSeq = 0;
        Set<Character> uniq = new HashSet<>();
        while (i < str.length() && j < str.length()) {
            while (j < str.length() && !uniq.contains(str.charAt(j))) {
                uniq.add(str.charAt(j));
                j++;
            }
            maxSeq = Math.max(maxSeq, j - i);
            i++;
            j = i;
            uniq.clear();
        }
        return maxSeq;
    }
}
