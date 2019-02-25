package com.interview.cruise.prepare;

import com.interview.uber.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestPathMazeTest {


    @Test
    public void shortestPath() {
        int[][] maze  = {{1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                {1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
                {1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                {1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                {1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }};
        ShortestPathMaze mazePath = new ShortestPathMaze(maze);
        Point source = new Point(0, 0);
        Point dest = new Point(3, 4);
        assertEquals(11, mazePath.shortestPath(source, dest));
    }
}