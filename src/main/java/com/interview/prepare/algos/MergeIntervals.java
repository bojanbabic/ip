package com.interview.prepare.algos;

import java.util.*;

/**
 * Created by bojan on 3/8/17.
 */
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 2) {
            return intervals;
        }
        int i = 0;
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval interval, Interval t1) {
                if (interval.start != t1.start)
                    return interval.start - t1.start;
                else return interval.end - t1.end;
            }
        });
        List<Interval> linkedIntervals = new LinkedList<Interval>(intervals);
        while(i < linkedIntervals.size() - 1) {
            Interval current = linkedIntervals.get(i);
            Interval next = linkedIntervals.get(i+1);
            if (current.end >= next.start) {
                Interval in = new Interval(Math.min(current.start, next.start), Math.max(current.end, next.end));
                linkedIntervals.remove(i+1);
                linkedIntervals.set(i, in);
            } else {
                i = i + 1;
            }
        }
        return linkedIntervals;
    }
}
