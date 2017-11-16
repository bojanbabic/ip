package com.programcreek.tasks;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by bbabic on 7/22/17.
 */
public class LongestConsecutiveTest {
    LongestConsecutive l = new LongestConsecutive();

    @Test
    public void testLongestConsecutive() throws Exception {
        int[] a = {100, 4, 200, 1, 3, 2};
        assertEquals(4, l.longestConsecutive(a));
    }
}