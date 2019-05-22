package com.interview.prepare.string;

public class ValidPalindrome {
    public boolean isPalindrome(char[] word) {
        if (word.length == 0) {
            return true;
        }
        int i = 0;
        int j = word.length - 1;
        while (i < j) {
            while (!isAlphaNum(word[i])) {
                i++;
            }
            while (!isAlphaNum(word[j])) {
                j--;
            }
            if (word[i] != word[j]) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public boolean isPalindromeRepeat(char[] word) {
        if (word.length < 2) {
            return true;
        }
        int i = 0;
        int j = word.length - 1;
        int d = (int)'A' - (int)'a';
        while (i < j) {
            while (!isAlphaNum(word[i]) && i < j) {
                i++;
            }
            while (!isAlphaNum(word[j]) && i < j) {
                j--;
            }

            if (word[i] != word[j]) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public boolean isPalindromeFaster(String s) {
        char[] word = s.toCharArray();
        if (word.length < 2) {
            return true;
        }
        int i = 0;
        int j = word.length - 1;
        while (i < j) {
            while (!isAlphaNum(word[i]) && i < j) {
                i++;
            }
            while (!isAlphaNum(word[j]) && i < j) {
                j--;
            }

            if (Character.toLowerCase(word[i]) != Character.toLowerCase(word[j])) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public boolean isPalindromeSlow(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean isAlphaNum(char c) {
        return (((int) c >= (int) 'a') && (int) c - (int) 'a' < 30)
                ||
                (c >= '0' && c <= '9')
                ||
                (((int) c >= (int) 'A') && (int) c - (int) 'A' < 30) ;
    }
}
