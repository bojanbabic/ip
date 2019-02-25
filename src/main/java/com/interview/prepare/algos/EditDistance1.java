package com.interview.prepare.algos;

import com.google.common.annotations.VisibleForTesting;

public class EditDistance1 {
    private char[] replaceChar(char[] str, int pos) {
        str[pos] = 'a';
        return str;
    }

    protected char[] inserChar(char[] str, int pos) {
        char[] newstr = new char[str.length + 1];
        System.arraycopy(str, 0, newstr, 0, pos);
        System.arraycopy(str, pos, newstr, pos + 1, str.length - pos);
        newstr[pos] = 'a';
        return newstr;
    }

    protected char[] deleteChar(char[] str, int pos) {
        char[] newstr = new char[str.length - 1];
        System.arraycopy(str, 0, newstr, 0, pos);
        System.arraycopy(str, pos + 1, newstr, pos, str.length - 1 - pos);
        return newstr;
    }

    public int minEditDistance(char[] string1, char string2[], int pos1, int pos2) {
        if (string1 == string2) {
            return 0;
        }
        while (pos1 < string1.length && pos2 < string2.length) {
            Math.min(minEditDistance(deleteChar(string1, pos1), string2, pos1, pos2), minEditDistance(inserChar(string1, pos1), string2, pos1, pos2));
        }
        return -1;
    }
}
