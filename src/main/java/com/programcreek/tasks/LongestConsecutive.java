package com.programcreek.tasks;

import java.util.HashSet;
import java.util.Set;

/**
 * http://www.programcreek.com/2013/01/leetcode-longest-consecutive-sequence-java/
 * Created by bbabic on 7/22/17.
 */
public class LongestConsecutive {
    int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for (int i: nums) {
            s.add(i);
        }
        int mx = 0;
        for (int i: nums) {
            if (s.contains(i)) {
                int cnt = 1;
                int left = i - 1;
                while (s.contains(left) && left > 0) {
                    cnt++;
                    left--;
                }
                int right = i + 1;
                while (s.contains(right)) {
                    cnt++;
                    right++;
                }
                s.remove(i);
                mx = Math.max(cnt, mx);
            }
        }
        return mx;
    }
}
