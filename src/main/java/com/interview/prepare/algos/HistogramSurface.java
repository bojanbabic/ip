package com.interview.prepare.algos;

import java.util.Stack;

/**
 * Created by bojan on 2/23/17.
 * https://www.hackerrank.com/challenges/largest-rectangle
 */
public class HistogramSurface {

    public int maxRectangle(int hist[]) {
        // Create an empty stack. The stack holds indexes of hist[] array
        // The bars stored in stack are always in increasing order of their
        // heights.
        Stack<Integer> s = new Stack<Integer>();

        int max_area = 0;
        int tp;
        int area_with_top;

        // Run through all bars of given histogram
        int i = 0;
        while (i < hist.length) {
            // If this bar is higher than the bar on top stack, push it to stack
            if (s.isEmpty() || hist[s.peek()] <= hist[i])
                s.push(i++);
                // If this bar is lower than top of stack, then calculate area of rectangle
                // with stack top as the smallest (or minimum height) bar. 'i' is
                // 'right index' for the top and element before top in stack is 'left index'
            else {
                tp = s.pop();  // pop the top
                // Calculate the area with hist[tp] stack as smallest bar
                // NOTE: s.peek() is the boundary!!! We know that hist[tp] will be greater than ALL elements until s.peek()
                area_with_top = hist[tp] * (s.isEmpty() ? i : i - s.peek() - 1);
                // update max area, if needed
                if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }

        // Now pop the remaining bars from stack and calculate area with every
        // popped bar as the smallest bar
        while (s.empty() == false) {
            tp = s.pop();
            area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);
            if (max_area < area_with_top)
                max_area = area_with_top;
        }
        System.out.println(max_area);
        return max_area;
    }
}
