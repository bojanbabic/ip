package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/26/17.
 */
public class MinWindowSubstringTest {
    MinWindowSubstring mtw = new MinWindowSubstring();
    @Test
    public void minWindow() throws Exception {
        assertEquals("baca", mtw.minWindow("acbbaca", "aba"));
        assertEquals("BANC", mtw.minWindow("ADOBECODEBANC", "ABC"));
    }
}