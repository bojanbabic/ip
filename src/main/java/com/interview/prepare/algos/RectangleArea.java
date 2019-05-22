package com.interview.prepare.algos;

public class RectangleArea {
    class Rectangle {
        int x1;
        int y1;
        int x2;
        int y2;

        Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public int area() {
            return Math.abs(x1 - x2)  * Math.abs(y1 - y2);
        }
    }

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        Rectangle r1 = new Rectangle(A, B, C, D);
        Rectangle r2 = new Rectangle(E, F, G, H);
        return r1.area() + r2.area() - overLap(r1, r2);
    }

    public int overLap(Rectangle r1, Rectangle r2) {
        int x_left = Math.max(r1.x1, r2.x1);
        int x_right = Math.min(r1.x2, r2.x2);
        int y_top = Math.min(r1.y2, r2.y2);
        int y_bottom = Math.max(r1.y1, r2.y1);

        if (x_left > x_right || y_bottom > y_top) {
            return 0;
        } else {
            return (x_right - x_left) * (y_top - y_bottom);
        }
    }
}
