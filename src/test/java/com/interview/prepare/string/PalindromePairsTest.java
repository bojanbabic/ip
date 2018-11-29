package com.interview.prepare.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/8/17.
 */
public class PalindromePairsTest {
    PalindromePairs pp = new PalindromePairs();
    @Test
    public void palindromePairs() throws Exception {
        String[] example = new String[]{"bat", "tab", "cat"};
//        assert(2, pp.fastPalindromePairs(example).size());
        String[] example1 = new String[]{"abcd", "dcba", "lls", "s", "sssll"};
        assertEquals(4, pp.fastPalindromePairs(example1).size());
        String[] example2 = new String[]{"", "s"};
        assertEquals(2, pp.fastPalindromePairs(example2).size());
    }

}