package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseBitsTest {

    @Test
    public void reverse() {
        assertEquals(964176192, new ReverseBits().reverse(43261596));
    }
}