package com.interview.amazon;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstring ls = new LongestSubstring();
        assertEquals(3, ls.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, ls.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, ls.lengthOfLongestSubstring("pwwkew"));
    }
}