package com.interview.prepare.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 2/21/17.
 */
public class QuickSelectTest {
    QuickSelect qs = new QuickSelect();
    @Test
    public void find() throws Exception {
        int[] a = {2, 4, 5, 7, 1, 3};
//        assertEquals(1, qs.find(1, a, 0, a.length - 1));
        assertEquals(2, qs.find(a, 0, a.length - 1, 2));
        assertEquals(5, qs.find(a, 0, a.length - 1, 5));
//        assertEquals(3, qs.find(a, 2));
//        assertEquals(3, qs.find(3, a, 0, a.length - 1));
//        assertEquals(4, qs.find(4, a, 0, a.length - 1));
    }

}