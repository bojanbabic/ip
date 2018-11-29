package com.interview.prepare.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {
    ValidPalindrome vp;

    @Before
    public void setup() {
        this.vp = new ValidPalindrome();
    }

    @Test
    public void testPalindorme() {
        assertTrue(vp.isPalindrome("anavolimilovana".toCharArray()));
        assertTrue(vp.isPalindrome("red rum, sir, is murder".toCharArray()));
    }

}