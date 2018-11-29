package com.interview.prepare.algos;

import java.util.Arrays;

/**
 * Regex implementation
 */
public class MatchExpression {
    /**
     * sample regex:
     * f(a*b, ab) = true
     * f(abc*, abbc) = false
     * f(**bc, bc) = true
     * @param regex
     * @param target
     * @return
     */
    public boolean match(char[] regex, char[] target, int ri, int ti) {
        char rchar = regex[ri];
        char tchar = target[ti];
        if (ri == regex.length - 1 && ti == target.length - 1) {
            return true;
        }
        if (ri == regex.length - 1 && ti < target.length - 1) {
            return false;
        }
        if (rchar == tchar) {
            return match(regex, target, ri + 1, ti + 1);
        }
        if (rchar == '*') {
            return match(regex, target, ri + 1, ti) || match(regex, target, ri, ti + 1);
        }
//        }
        return true;
    }
}
