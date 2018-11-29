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

    private boolean isAlphaNum(char c) {
        return (((int) c >= (int) 'a') && (int) c - (int) 'a' < 30) || (c >= '0' && c <= '9');
    }
}
