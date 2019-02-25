package com.interview.prepare.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {
    NumberOfIslands ni = new NumberOfIslands();
    @Test
    public void count() {
        int[][] grid = {
                {1,1,1,1,0},
                {1,1,0,1,0},
                {1,1,0,0,0},
                {0,0,0,0,0}
        };
        assertEquals(1, ni.count(grid));
        int[][] grid1 = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,1}
        };
        assertEquals(3, ni.count(grid1));
    }
}