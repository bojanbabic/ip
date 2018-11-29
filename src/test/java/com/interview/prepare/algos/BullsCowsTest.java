package com.interview.prepare.algos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BullsCowsTest {

    BullsCows bullsCows = new BullsCows();

    @Test
    public void calculate() {
//        assertEquals("1A3B", bullsCows.calculate("1807".toCharArray(), "7810".toCharArray()));
        assertEquals("1A1B", bullsCows.calculate("1123".toCharArray(), "0111".toCharArray()));
    }
}