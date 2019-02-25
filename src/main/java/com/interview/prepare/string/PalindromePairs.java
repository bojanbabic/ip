package com.interview.prepare.string;

import java.util.*;

/**
 * https://leetcode.com/problems/palindrome-pairs/#/description
 * Created by bojan on 3/8/17.
 */
public class PalindromePairs {


    public List<List<Integer>> fastPalindromePairs(String[] words) {
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        List<List<Integer>> palindroms = new ArrayList<List<Integer>>();
        for (int i = 0; i < words.length; i++) {
            wordMap.put(words[i], i);
        }

        if (wordMap.containsKey("")) {
            for (String w: wordMap.keySet()) {
                if (w.equals("")) continue;
                if (isPalindrome(w)) {
                    palindroms.add(Arrays.asList(wordMap.get(w), wordMap.get("")));
                    palindroms.add(Arrays.asList(wordMap.get(""), wordMap.get(w)));
                }
            }
        }

        for (String w: wordMap.keySet()) {
            String reverse = new StringBuilder().append(w).reverse().toString();
            if (wordMap.containsKey(reverse)) {
                if (wordMap.get(w) == wordMap.get(reverse)) continue;
                palindroms.add(Arrays.asList(wordMap.get(reverse), wordMap.get(w)));
            }
        }

        for (String w: wordMap.keySet()) {
            for (int i = 1; i < w.length(); i++) {
                String cut = w.substring(0, i);
                if (isPalindrome(cut)) {
                    String rest = new StringBuilder().append(w.substring(i)).reverse().toString();
                    if (wordMap.containsKey(rest)) {
                        palindroms.add(Arrays.asList(wordMap.get(w), wordMap.get(rest)));
                    }
                }
                String rest = w.substring(i);
                if (isPalindrome(rest)) {
                    String start = new StringBuilder().append(w.substring(0, i)).reverse().toString();
                    if (wordMap.containsKey(start)) {
                        palindroms.add(Arrays.asList(wordMap.get(start), wordMap.get(w)));
                    }
                }
            }
        }
        return palindroms;
    }
    // naive solution
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> palindroms = new ArrayList<List<Integer>>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String concat = words[i] + words[j];
                if (isPalindrome(concat)) palindroms.add(Arrays.asList(i, j));
                String concatSwap = words[j] + words[i];
                if (isPalindrome(concatSwap)) palindroms.add(Arrays.asList(j, i));
            }
        }
        return palindroms;
    }
    private boolean isPalindrome(String s) {
        int mid = s.length()/2;
        for (int k = 0; k < mid; k++) {
            if (s.charAt(k) != s.charAt(s.length() - k - 1)) {
                return false;
            }
        }
        return true;
    }
}
