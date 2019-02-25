package com.interview.cruise.prepare;
/*
Your previous Python 2 content is preserved below:

"""
It's late 2019 and Cruise has launched its self-driving ride-hailing service in San Francisco! Customers can take trips around the city in Cruise cars. For this problem, we'll assume a trip involves a single car taking a single passenger from point A to point B. A trip has a distinct start time and end time. A car cannot start a new trip until it has finished its current trip. Below are some examples of trips taken by one or more cars (x-axis is time).

Example 1:
|--A--|

^ Car A does a trip

Example 2:
|--A--|  |---A---|

^ Car A does two trips with a break in between

Example 3:
|--A--|  |---A---|
  |----B----| |--B--|
 |------C------|

^ Car A does two trips, car B does 2 trips, and car C does 1 trip.

Invalid Example !1:
|--A--|
   |--A--|

^ Car A cannot start a second trip while its first trip is in progress.

We're interested in graphing demand for our ride-hailing service. To determine demand, we'll consider the number of trips that are active at a given time. We want a series of time intervals with the number of active trips for each interval. Each time interval should have a different active trip count than the intervals before and after it. Below is an example to help illustrate:

Input:
Graphically:
|--A--| |--A--|
  |---B---|
As a list of Trips, format is Trip(car_name, start_time, end_time)
[Trip('A', 0, 5), Trip('A', 6, 11), Trip('B', 2, 7)]

Result:
[{
    start: 0,
    end: 2,
    trip_count: 1,
}, {
    start: 2,
    end: 5,
    trip_count: 2,
}, {
    start: 5,
    end: 6,
    trip_count: 1,
}, {
    start: 6,
    end: 7,
    trip_count: 2,
}, {
    start: 7,
    end: 11,
    trip_count: 1,
}]

"""

def build_trip_count_intervals(trips):
    pass
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */



class IntervalRides {

    class Trip {
        String car;
        int start;
        int end;

        public Trip(String car, int start, int end) {
            this.car = car;
            this.start = start;
            this.end = end;
        }
    }

    class TripCountInterval {
        int count;
        int start;
        int end;

        public TripCountInterval(int count, int start, int end) {
            this.count = count;
            this.start = start;
            this.end = end;
        }

        public String toString() {
            return "{" + "count=" + this.count + "|" + this.start + "," + this.end + "}";
        }
    }
    public List<TripCountInterval> buildTripCountIntervals(List<Trip> trips) {
        // implement here
        Integer[] allIntervals = getAllIntervals(trips);
        List<TripCountInterval> tripCountList = new ArrayList<TripCountInterval>();
        // convert into array
        for (int i = 0; i < allIntervals.length - 1; i++) {
            Integer start = allIntervals[i];
            Integer end = allIntervals[i + 1];
            TripCountInterval ti = new TripCountInterval(0, start, end);
            for (Trip trip: trips) {
                // |-|-|   <-intervals
                //     {-------}
                // {------}        possible trips
                // {---}  {----}
                // {-}      {--}
                if (ti.start < trip.end && ti.end > trip.start) {
                    ti.count = ti.count + 1;
                }
            }
            tripCountList.add(ti);
        }
        return tripCountList;
    }

    private Integer[] getAllIntervals(List<Trip> trips) {
        Set<Integer> intervals = new HashSet<Integer>();
        trips.stream().forEach(t -> {
            intervals.add(t.start);
            intervals.add(t.end);
        });
        return intervals.toArray(new Integer[intervals.size()]);
    }
}

