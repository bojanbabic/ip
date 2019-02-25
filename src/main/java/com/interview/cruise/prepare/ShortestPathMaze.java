package com.interview.cruise.prepare;

import com.interview.uber.Point;

public class ShortestPathMaze {
    int[][] grid;

    public ShortestPathMaze(int[][] grid) {
        this.grid = grid;
    }

    class Counter {
        int c;
        public Counter() {
            c = 0;
        }
        public void inc() {
            c = c + 1;
        }
    }

    public int shortestPath(Point source, Point desc) {
        Counter c = new Counter();
        steps(source, desc, c);
        return c.c;
    }

    private boolean steps(Point source, Point dest, Counter c) {
        if (source.x  < 0 || source.y < 0 || source.x >= grid[0].length || source.y >= grid.length) {
            return false;
        }

        if (grid[source.x][source.y] == 0) {
            return false;
        }

        if (source.equals(dest)) {
            return true;
        }
        c.inc();
        grid[source.x][source.y] = 0;
        boolean found = steps(new Point(source.x + 1, source.y), dest, c) || steps(new Point(source.x, source.y + 1), dest, c) ||
                steps(new Point(source.x - 1, source.y), dest, c) || steps(new Point(source.x, source.y - 1), dest, c);
        grid[source.x][source.y] = 1;
        return found;
    }
}
