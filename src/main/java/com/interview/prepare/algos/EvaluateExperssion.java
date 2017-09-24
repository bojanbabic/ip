package com.interview.prepare.algos;

import java.util.Stack;

/**
 * https://www.glassdoor.com/Interview/Facebook-Software-Engineer-Interview-Questions-EI_IE40772.0,8_KO9,26.htm#InterviewReview_14304775
 * preresent unary ops as binary
 * Created by bojan on 4/4/17.
 */
public class EvaluateExperssion {
    public int calculate(String expressionString) {
        int i = 0;
        Stack<Integer> operatorsStack = new Stack<Integer>();
        Stack<Character> operationStack = new Stack<Character>();
        Stack<Character> unaryOperationStack = new Stack<Character>();
        while (i < expressionString.length()) {
            Character token = expressionString.charAt(i);
            if (token == '(') {
                Character nextToken = expressionString.charAt(i + 1);
                if (nextToken == '-') {
                    unaryOperationStack.push('-');
                    i++;
                }
                operationStack.push(token);
            } else if ("+-".contains(token.toString())) {
                operationStack.push(token);
            } else if (')' == token) {
                Character operation = operationStack.pop();
                while (operation != '(') {
                    if (operation == '+') {
                        Integer left = operatorsStack.pop();
                        Integer right = operatorsStack.pop();
                        Integer res = left + right;
                        operatorsStack.push(res.intValue());
                    } else if (operation == '-') {
                        Integer left = operatorsStack.pop();
                        Integer right = operatorsStack.pop();
                        Integer res = right - left;
                        operatorsStack.push(res.intValue());
                    }
                    operation = operationStack.pop();
                }
            } else {
                operatorsStack.push(Integer.parseInt(token.toString()));
            }
            i++;
        }
        return operatorsStack.pop();
    }
}
