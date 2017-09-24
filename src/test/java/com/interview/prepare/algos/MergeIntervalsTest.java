package com.interview.prepare.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/8/17.
 */
public class MergeIntervalsTest {
    MergeIntervals mi = new MergeIntervals();
    @Test
    public void merge() throws Exception {
        Interval i1 = new Interval(1, 3);
        Interval i2 = new Interval(2, 6);
        Interval i3 = new Interval(8, 10);
        Interval i4 = new Interval(15, 18);
        List<Interval> intervals = Arrays.asList(i1, i2, i3, i4);
//        assertEquals(3, mi.merge(intervals).size());
        Interval ii1 = new Interval(1,4);
        Interval ii2 = new Interval(0,2);
        Interval ii3 = new Interval(3,5);
        List<Interval> intervals1 = Arrays.asList(ii1, ii2, ii3);
        assertEquals(1, mi.merge(intervals1).size());
    }

}