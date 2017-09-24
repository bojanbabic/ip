package com.interview.prepare.algos;

/**
 * Created by bojan on 3/8/17.
 */
public class Interval implements Comparable<Interval> {
    int start;
    int end;
    Interval() {
        start = 0; end = 0;
    }

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int compareTo(Interval interval) {
        return this.start - interval.start;
    }
}
