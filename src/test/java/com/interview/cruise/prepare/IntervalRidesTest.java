package com.interview.cruise.prepare;

import com.interview.cruise.prepare.IntervalRides.Trip;
import com.interview.cruise.prepare.IntervalRides.TripCountInterval;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IntervalRidesTest {

    IntervalRides ir = new IntervalRides();

    @Test
    public void buildTripCountIntervals() {
        // [Trip('A', 0, 5), Trip('A', 6, 11), Trip('B', 2, 7)]
        Trip tripA1 = ir.new Trip("A", 0, 5);
        Trip tripA2 = ir.new Trip("A", 6, 11);
        Trip tripB1 = ir.new Trip("B", 2, 7);

        List<Trip> trips = new ArrayList<Trip>(Arrays.asList(tripA1, tripA2, tripB1));

        List<TripCountInterval> intervals = ir.buildTripCountIntervals(trips);
        System.out.println(intervals);
    }
}