package com.interview.uber;

import com.google.common.base.Objects;

public class Point {
    public int x;
    public int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Point point = (Point) o;
      return x == point.x &&
              y == point.y;
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(x, y);
    }
}
