package com.interview.prepare.datastructures;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestPathIslandsTest {

    @Test
    public void shortestIslandDistance() {
        int[][] grid = {
            {1, 0, 0, 0, 0, 1},
            {1, 1, 0, 0, 0, 1},
            {1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0}
        };

        ShortestPathIslands islands = new ShortestPathIslands();
        Assert.assertEquals(4, islands.shortestIslandDistance(grid));
    }
}