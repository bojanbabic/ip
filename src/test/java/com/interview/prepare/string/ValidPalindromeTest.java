package com.interview.prepare.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {
    ValidPalindrome vp;

    @Before
    public void setup() {
        this.vp = new ValidPalindrome();
    }

    @Test
    public void testPalindorme() {
        assertTrue(vp.isPalindromeRepeat("anavolimilovana".toCharArray()));
        assertTrue(vp.isPalindromeRepeat("red rum, sir, is murder".toCharArray()));
        assertTrue(vp.isPalindromeRepeat("a man, a plan, a canal: panama".toCharArray()));
//        assertFalse(vp.isPalindrome("0P".toCharArray()));
    }

    @Test
    public void testPalindromeSlow() {
//        assertTrue(vp.isPalindromeSlow("anavolimilovana"));
//        assertTrue(vp.isPalindromeSlow("red rum, sir, is murder"));
        assertTrue(vp.isPalindromeFaster("A man, a plan, a canal: Panama"));
        assertFalse(vp.isPalindromeFaster("0P"));
    }

}