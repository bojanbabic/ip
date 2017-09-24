package com.interview.prepare.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/#/description
 * Created by bojan on 3/8/17.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        partialSum(combinations, candidates, new ArrayList<Integer>(), target);
        return combinations;
    }

    private void partialSum(List<List<Integer>> combinations, int[] candidates, List<Integer> partialInts, int target) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] < target) {
                List<Integer> partials = new ArrayList<Integer>(partialInts);
                partials.add(candidates[i]);
                partialSum(combinations, candidates, partials, target - candidates[i]);
            } else if (candidates[i] == target) {
                partialInts.add(candidates[i]);
                Collections.sort(partialInts);
                if (!combinations.contains(partialInts)) {
                    combinations.add(new ArrayList<Integer>(partialInts));
                    // solved performance issues
                    // partialInts = new ArrayList<Integer>();
                }
            }
        }
    }
}
