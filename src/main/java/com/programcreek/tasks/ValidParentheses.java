package com.programcreek.tasks;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    private static final List validChars = Arrays.asList('[', ']', '(', ')', '{', '}');
    private static final Map<Character, Character> pairs = Maps.newHashMap();

    static {
        pairs.put('{', '}');
        pairs.put('(', ')');
        pairs.put('[', ']');
    }

    private Stack<Character> stack = new Stack<Character>();

    @VisibleForTesting
    boolean isValid(String s) {
        if (Strings.isNullOrEmpty(s)) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (!validChars.contains(c)) {
                return false;
            }
            if (pairs.keySet().contains(c)) {
                stack.push(pairs.get(c));
            } else {
                if (!stack.isEmpty() && stack.peek() != c) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    int longestValid(String s) {
        if (Strings.isNullOrEmpty(s)) {
            return 0;
        }
        int maxSequence = -1;
        int currentSequence = 0;
        for (char c : s.toCharArray()) {
            if (!validChars.contains(c)) {
                return 0;
            }
            if (pairs.keySet().contains(c)) {
                currentSequence++;
                stack.push(pairs.get(c));
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() != c) {
                        maxSequence = Math.max(currentSequence, maxSequence);
                        currentSequence = 0;
                    } else {
                        stack.pop();
                        currentSequence++;
                        // memorize max
                        if (stack.isEmpty()) {
                            maxSequence = currentSequence;
                        }
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            currentSequence = 0;
        }
        return Math.max(currentSequence, maxSequence);
    }
}

