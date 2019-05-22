package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomIndexTest {

    @Test
    public void pickIndex() {
        int[] idxs = {1};
        RandomIndex ri = new RandomIndex(idxs);
        assertEquals(0, ri.pickIndex());
    }
}