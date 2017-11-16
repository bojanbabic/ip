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

    public List<List<Integer>> combinationSumBacktracking(ArrayList<Integer> candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> partials = new ArrayList<Integer>();
        partialSumsBacktracking(list, partials, candidates, target);
        return list;
    }

    private void partialSumsBacktracking(List<List<Integer>> list, List<Integer> partials,
        ArrayList<Integer> candidates, int target) {
        if (target == 0) {
            Collections.sort(partials);
            if (!list.contains(partials)) {
                list.add(partials);
            }
        } else {
            for (int i = 0; i < candidates.size(); i++) {
                if (candidates.get(i) > target) {
                    continue;
                }
                partials.add(candidates.get(i));
                partialSumsBacktracking(list, new ArrayList<Integer>(partials), candidates, target - candidates.get(i));
                partials.remove(partials.size() - 1);
            }
        }
    }
}
