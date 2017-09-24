package com.interview.prepare.algos;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence
 * Created by bojan on 4/8/17.
 */
public class LongestConsecutiveDistance {
    Set<Integer> hashSet = new HashSet<Integer>();
    public int longestConsecutive(int[] nums) {
        int max = 1;
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int cnt = 1;
            int n = nums[i];
            int prev = n - 1;
            int next = n + 1;
            while (hashSet.contains(prev)) {
                cnt++;
                hashSet.remove(prev);
                prev--;
            }
            while (hashSet.contains(next)) {
                cnt++;
                hashSet.remove(next);
                next++;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}
