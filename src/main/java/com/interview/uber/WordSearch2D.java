package com.interview.uber;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * https://www.programcreek.com/2014/06/leetcode-word-search-java/
 * Created by bbabic on 9/25/17.
 */
public class WordSearch2D {
  char[][] matrix;
  Map<Character, List<Point>> map;
  /*
Given board =

[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.

 */
  class Point {
    int x;
    int y;

    public Point(final int x, final int y) {
      this.x = x;
      this.y = y;
    }
  }

  public WordSearch2D(final char[][] matrix) {
    this.matrix = matrix;
    preprocess();
  }

  public boolean findMatch(char[] string) {
    for (int i = 0; i < string.length - 1; i++) {
      char currentChar = string[i];
      char nextChar = string[i + 1];
      List<Point> neighbours = map.get(currentChar);
      Point next = null;
      for (Point p: neighbours) {
        Point currentPoint = p;
        Point nextPoint = nextPoint(p, nextChar);
      }
    }
    return false;
  }

  private Point nextPoint(Point p, char nextChar) {
    Point nextPoint = null;
//    for (Point p: startingPoints) {
      // go left
      Point left = goLeft(p);
      if (left != null && matrix[left.x][left.y] == nextChar) {
        nextPoint = left;
      }
      Point right = goRight(p);
      // go right
      if (right != null && matrix[right.x][right.y] == nextChar) {
        nextPoint = right;
      }
      // go up
      Point up = goUp(p);
      if (right != null && matrix[up.x][up.y] == nextChar) {
        nextPoint = up;
      }
      // go down
      Point down = goDown(p);
      if (down != null && matrix[down.x][down.y] == nextChar) {
        nextPoint = down ;
      }
//    }
    return nextPoint;
  }


  private Point goLeft(Point point) {
    if (point.y == 0) {
      return null;
    }
    return new Point(point.x, point.y -1);
  }

  private Point goRight(Point point) {
    if (point.y == matrix[0].length - 1) {
      return null;
    }
    return new Point(point.x, point.y +1);
  }

  private Point goUp(Point point) {
    if (point.x == 0) {
      return null;
    }
    return new Point(point.x + 1, point.y);
  }

  private Point goDown(Point point) {
    if (point.x == matrix.length - 1) {
      return null;
    }
    return new Point(point.x + 1, point.y);
  }

  private void preprocess() {
    for (int i = 0; i < matrix[0].length; i++) {
      for (int j = 0; j < matrix.length; i++) {
        List<Point> existingPoints = map.get(matrix[i][j]);
        if (existingPoints != null) {
          existingPoints.add(new Point(i, j));
        } else {
          List<Point> points = new ArrayList<Point>();
          map.put(matrix[i][j], points);
        }
      }
    }
  }
}
