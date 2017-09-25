package com.square.interview;

/**
 * Created by bbabic on 7/24/17.
 */
import java.io.*;
import java.util.*;
import java.lang.Comparable;

/*
^
| k = 2
|
|
|    . D
|                  . F
|          . C
|
|    -------------
|    | . A       |
|    |           |
|    |       . B |
|    -------------          . E
|
| . X
-------------------------------->

If X is the base point and k = 2, our answer would be A and B.

Sample input and output:

k_nearest_points(
  base_point: (0, 0),
  list_of_points: [(2, 2), (1, 1), (3, 3), (0, 0), (5, 5), (4, 4)],
  k: 3
) => [(0, 0), (2, 2), (1, 1)]
 */

class Point {
    int x;
    int y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class PointDistance implements Comparable<PointDistance> {
    Point from;
    Point to;
    Double distance;

    PointDistance(Point from, Point to, Double distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public int compareTo(PointDistance o) {
        if (this.distance - o.distance == 0) {
            return 0;
        }
        return this.distance - o.distance > 0? 1: -1;
    }

    public String toString() {
        return from.x + "," + from.y + "|" + to.x +"," + to.y + "=>" + distance;
    }
}

class Solution {

    public static Double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    public static List<PointDistance> closest(Point base, List<Point> list, int k) {
        List<PointDistance> result = new ArrayList<PointDistance>();
        for (Point p: list) {
            result.add(new PointDistance(base, p, distance(base, p)));
        }
        Collections.sort(result);
        if (result.size() < k) {
            return result;
        }
        return result.subList(0,k);
    }

    public static void main(String[] args) {

        Point p0 = new Point(0, 0);
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(4, 4);
        Point p5 = new Point(5, 5);

        List<Point> unsorted = new ArrayList<Point>();
        unsorted.add(p4);
        unsorted.add(p2);
        unsorted.add(p1);
        unsorted.add(p3);
        unsorted.add(p5);
        System.out.println(closest(p0, unsorted, 3));

    }


}

