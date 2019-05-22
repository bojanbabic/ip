package com.interview.uber;

import com.interview.prepare.algos.Interval;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://www.programcreek.com/2014/05/leetcode-meeting-rooms-ii-java/
 */
public class MeetingRooms2 {
    public int minMeetingRooms(Interval[] intervals) {
        int cnt = 0;
        if (intervals == null || intervals.length == 0) {
            return cnt;
        }
        Arrays.sort(intervals);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(intervals[0].end);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < pq.peek()) {
                cnt++;
            } else {
                pq.poll();
                pq.offer(intervals[i].end);
            }
        }
        return cnt;
    }
}
