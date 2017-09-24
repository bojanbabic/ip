package com.interview.prepare.algos;

import java.util.HashMap;

/**
 * Created by bojan on 3/26/17.
 * https://web.archive.org/web/20160824065414/http://articles.leetcode.com/finding-minimum-window-in-s-which/
 */
public class MinWindowSubstring {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> needToFind = new HashMap<Character, Integer>();
        for (Character c: t.toCharArray()) {
            if (needToFind.containsKey(c)) {
                needToFind.put(c, needToFind.get(c) + 1);
            } else {
                needToFind.put(c, 1);
            }
        }
        HashMap<Character, Integer> hasFound = new HashMap<Character, Integer>();
        int start = 0;
        int cnt = 0; int min = s.length();
        int minWindowStart = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (needToFind.containsKey(c)) {
                if (hasFound.containsKey(c)) {
                    hasFound.put(c, hasFound.get(c) + 1);
                } else {
                    hasFound.put(c, 1);
                }
                if (hasFound.get(c) == needToFind.get(c)) {
                    cnt++;
                }
            }
            if (cnt == needToFind.keySet().size()) {
                while (!needToFind.containsKey(s.charAt(start)) || hasFound.get(s.charAt(start)) > needToFind.get(s.charAt(start))) {
                    if (needToFind.containsKey(s.charAt(start)) && hasFound.get(s.charAt(start)) > needToFind.get(s.charAt(start))) {
                        hasFound.put(s.charAt(start), hasFound.get(s.charAt(start)) - 1);
                    }
                    start++;
                }
                int windowLen = i - start;
                if (windowLen < min) {
                    min = windowLen;
                    minWindowStart = start;
                }
            }
        }
        return cnt == needToFind.keySet().size() ? s.substring(minWindowStart, minWindowStart + min + 1): "";

    }
}
