package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 2/23/17.
 */
public class HistogramSurfaceTest {
    HistogramSurface hs = new HistogramSurface();
    @Test
    public void maxRectangle() throws Exception {
//        int[] h = {1, 2, 3, 4, 5};
//        assertEquals(9, hs.maxRectangle(h));
//        int[] h1 = {1, 2, 3, 4, 5, 4};
//        assertEquals(12, hs.maxRectangle(h1));
        int[] h2 = {6, 2, 5, 4, 5, 1, 6};
        assertEquals(12, hs.maxRectangle(h2));
//        int[] h3 = {6, 2, 5, 4, 3, 1, 6};
//        assertEquals(10, hs.maxRectangle(h3));
    }

}