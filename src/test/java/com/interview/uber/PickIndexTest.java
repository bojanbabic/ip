package com.interview.uber;

import org.junit.Test;

import static org.junit.Assert.*;

public class PickIndexTest {

    @Test
    public void pickIndex() {
        int[] w = {3, 1};
        PickIndex pi = new PickIndex(w);
        System.out.println(pi.pickIndex());
        System.out.println(pi.pickIndex());
        System.out.println(pi.pickIndex());
    }
}