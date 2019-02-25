package com.interview.uber;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public class GenerateParentheses {
    static Map<Character, Character> pairs = Maps.newHashMap();
    static {
        pairs.put(')', '(');
    }
    char[] chars = {'(', ')'};

    public List<String> generateParenthesis(int n) {
        int maxChars = chars.length * n;
        List<String> valid = Lists.newArrayList();
        generateHelper(valid, "", maxChars);
        return valid;
    }

    public void generateHelper(List<String> valid, String currentString, int n) {
        if (currentString.length() == n) {
            if (isValid(currentString)) {
                valid.add(currentString);
            }
        } else {
            for (int i = 0; i < chars.length; i++) {
                currentString = currentString + chars[i];
                generateHelper(valid, currentString, n);
                currentString = currentString.substring(0, currentString.length() - 1);
            }
        }
    }

    protected boolean isValid(String parentheses) {
        Stack<Character> stack = new Stack<>();
        stack.push(parentheses.charAt(0));
        for (int i = 1; i < parentheses.length(); i++) {
            Character current = parentheses.charAt(i);
            if (!stack.isEmpty() && stack.peek().equals(pairs.get(current))) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }
        return stack.isEmpty();
    }
}
