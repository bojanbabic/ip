package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://leetcode.com/problems/evaluate-reverse-polish-notation
 */
public class EvaluateRPNTest {
    EvaluateRPN e = new EvaluateRPN();
    @Test
    public void evalRPN() throws Exception {
        String[] s = {"18"};
        e.evalRPN(s);
    }

}