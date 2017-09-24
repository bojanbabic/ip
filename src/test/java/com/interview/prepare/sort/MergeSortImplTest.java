package com.interview.prepare.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/26/17.
 */
public class MergeSortImplTest {
    MergeSortImpl ms = new MergeSortImpl();
    @Test
    public void merge() throws Exception {
        int[] a = {5, 2, 4, 6, 1, 3, 2, 6};
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 5, 6, 6}, ms.merge(a));
    }

}