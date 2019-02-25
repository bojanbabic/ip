package com.interview.lyft;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class ArrayIntersection {
    // 2ms solution
    public int[] intersection(int[] a1, int[] a2) {
        Set<Integer> set1 = new HashSet<>();
        List<Integer> intersection = new ArrayList<>();
        for (int i=0; i < a1.length; i++) set1.add(a1[i]);
        // IntStream.of(a1).forEach(a -> set1.add(a));
        for (int i = 0; i < a2.length; i++) {
            // IntStream.of(a2).forEach(a -> {
            if (set1.contains(a2[i])) {
                intersection.add(a2[i]);
                set1.remove(a2[i]);
            }
        }
        // });
        int[] res = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) res[i] = intersection.get(i);
        // return intersection.stream().mapToInt(a -> a.intValue()).toArray();
        return res;    }
}
