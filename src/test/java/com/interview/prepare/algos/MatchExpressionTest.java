package com.interview.prepare.algos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatchExpressionTest {

    MatchExpression me;
    @Before
    public void setup() {
        me = new MatchExpression();
    }

    @Test
    public void testMatchExpression() {
        Assert.assertTrue(me.match("a*b".toCharArray(), "ab".toCharArray(), 0, 0));
        Assert.assertFalse(me.match("ab*".toCharArray(), "abbc".toCharArray(), 0, 0));
        Assert.assertTrue(me.match("**bc".toCharArray(), "bc".toCharArray(), 0, 0));
    }

}