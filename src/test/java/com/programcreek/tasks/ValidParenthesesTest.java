package com.programcreek.tasks;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();
    @Test
    public void testIsValid() {
        Assert.assertFalse(validParentheses.isValid(""));
        Assert.assertTrue(validParentheses.isValid("()[]{}"));
        Assert.assertTrue(validParentheses.isValid("([{}]){}"));
    }

    @Test
    public void testLongestValid() {
        Assert.assertEquals(0, validParentheses.longestValid(""));
        Assert.assertEquals(2, validParentheses.longestValid("{}"));
        Assert.assertEquals(2, validParentheses.longestValid("){}"));
        Assert.assertEquals(4, validParentheses.longestValid(")()())"));
        Assert.assertEquals(4, validParentheses.longestValid("(())(()"));
    }

}