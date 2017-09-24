package com.interview.prepare.algos;

import java.util.Stack;

/**
 * https://leetcode.com/problems/evaluate-reverse-polish-notation
 * Created by bojan on 4/7/17.
 */
public class EvaluateRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int res = 0;
        while (i < tokens.length) {
            String token = tokens[i];
            if (token.equals("+")) {
                Integer left = stack.pop();
                Integer right = stack.pop();
                res = left + right;
                stack.push(res);
            } else if (token.equals("-")) {
                Integer left = stack.pop();
                Integer right = stack.pop();
                res = left - right;
                stack.push(res);
            } else if (token.equals("*")) {
                Integer left = stack.pop();
                Integer right = stack.pop();
                res = left * right;
                stack.push(res);
            } else if (token.equals("/")) {
                Integer left = stack.pop();
                Integer right = stack.pop();
                res = left / right;
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(token));
            }
            i++;
        }
        return res;
    }
}
