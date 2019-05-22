package com.interview.uber;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WordBreakTest {

    @Test
    public void wordBreak() {
        WordBreak wb = new WordBreak();
        List<String> wordDict = Arrays.asList("leet", "code");
        String s = "leetcode";
        assertTrue(wb.wordBreak(s, wordDict));

        String s1 = "applepenapple";
        List<String> wordDict1 = Arrays.asList("apple", "pen");
        assertTrue(wb.wordBreak(s1, wordDict1));

        String s2 = "catsandog";
        List<String> wordDict2 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        assertFalse(wb.wordBreak(s2, wordDict2));
    }
}