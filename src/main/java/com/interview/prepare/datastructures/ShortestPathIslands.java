package com.interview.prepare.datastructures;



import java.util.*;

public class ShortestPathIslands {
    /*
    //Island distance
    //There are several islands in the Pacific. Find the shortest distance between the largest island and //the smallest island.



    /*
    100001
    110001
    110000
    000010

    (2,1) -> (3, 4)

    */
    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int shortestIslandDistance(int[][] grid) {
        List<List<Point>> islands = extractTheIslands(grid);
        List<List<Point>> minMax = getMinMax(islands);
        return calculatedShortestDistance(grid, minMax.get(0), minMax.get(1));
    }


    private List<List<Point>> extractTheIslands(int[][] grid) {
        List<List<Point>> islands = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    List<Point> newIsland = new ArrayList();
                    dfsIsland(grid, i, j, newIsland);
                    islands.add(newIsland);
                }
            }
        }
        return islands;
    }

    private void dfsIsland(int[] [] grid, int i, int j, List<Point> newIsland) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return;
        }

        if (grid[i][j] == 1) {
            newIsland.add(new Point(i, j));
            grid[i][j] = 0;
            dfsIsland(grid, i + 1, j, newIsland);
            dfsIsland(grid, i - 1, j, newIsland);
            dfsIsland(grid, i, j + 1, newIsland);
            dfsIsland(grid, i, j - 1, newIsland);
            grid[i][j] = 1;
        } else {
            return;
        }
    }

    private List<List<Point>> getMinMax(List<List<Point>> islands) {
        int minSize = Integer.MAX_VALUE;
        List<Point> minIsland = new ArrayList<>();
        List<Point> maxIsland = new ArrayList<>();
        int maxSize = Integer.MIN_VALUE;
        for (List<Point> p : islands) {
            if (p.size() < minSize) {
                minSize = p.size();
                minIsland = p;
            } else if (p.size() > maxSize) {
                maxSize = p.size();
                maxIsland = p;
            }
        }
        return Arrays.asList(minIsland, maxIsland);
    }

    private int calculatedShortestDistance(int[][] grid, List<Point> minIsland, List<Point> maxIsland) {
        int min = Integer.MAX_VALUE;
        for (Point pmin : minIsland) {
            if (!isOuterEdge(grid, pmin)) {
                continue;
            }
            for (Point pmax : maxIsland) {
                if (!isOuterEdge(grid, pmax)) {
                    continue;
                }
                int distance = manhatanDist(pmin, pmax);
                if (distance < min) {
                    min = distance;
                }
            }
        }
        return min;
    }

    private int manhatanDist(Point x, Point y) {
        return Math.abs(x.x - y.x) + Math.abs(x.y - y.y);
    }

    private boolean isOuterEdge(int[][] grid, Point p) {
        if (p.x + 1 >= 0 && p.x + 1 < grid.length && grid[p.x + 1][p.y] == 0 ||
            p.x - 1 >= 0 && p.x - 1 < grid.length && grid[p.x - 1][p.y] == 0 ||
            p.y + 1 >= 0 && p.y + 1 < grid[0].length && grid[p.x][p.y + 1] == 0 ||
            p.y - 1 >= 0 && p.y - 1 < grid[0].length && grid[p.x][p.y - 1] == 0) {
            return true;
        }
        return false;
    }




}
