package com.interview.prepare.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/#/description
 * TODO check the rest of the problems https://leetcode.com/problems/permutations/#/solutions
 * Created by bojan on 4/12/17.
 */
public class Backtracking {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrackSubsets(ans, new ArrayList<Integer>(), nums, 0);
        System.out.println(ans);
        return ans;
    }

    public List<List<Integer>> permutations(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrackPermutations(ans, new ArrayList<Integer>(), nums);
        System.out.println(ans);
        return ans;
    }

    private void backtrackSubsets(List<List<Integer>> list, List<Integer> tmpList, int[] nums, int start) {
        list.add(new ArrayList<Integer>(tmpList));
        for (int i = start; i < nums.length; i++) {
            // skip duplicates
            if(i > start && nums[i] == nums[i-1]) {
                continue; // skip duplicates
            }
            tmpList.add(nums[i]);
//            System.out.println("before recursion:" + tmpList);
            backtrackSubsets(list, tmpList, nums, i + 1);
//            System.out.println("recursion callback:" + tmpList);
            // key - after every stack return empties tmpList
            tmpList.remove(tmpList.size() - 1);
        }
    }

    private void backtrackPermutations(List<List<Integer>> list, List<Integer> tmpList, int[] nums) {
        if (tmpList.size() == nums.length) {
            list.add(new ArrayList<Integer>(tmpList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                if (tmpList.contains(nums[i])) continue;
                tmpList.add(nums[i]);
                System.out.println("before recursion:" + tmpList);
                backtrackPermutations(list, tmpList, nums);
                System.out.println("recursion callback:" + tmpList);
                // key - after every stack return empties tmpList
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }

    public List<List<Integer>> permutationsWithRepeat(int[] list) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();
        backtrackPermutationsWithRepeat(result, tmpList, list, list.length);
        return result;
    }
    private void backtrackPermutationsWithRepeat(List<List<Integer>> list, List<Integer> tmpList, int[] nums, int k) {
       if (tmpList.size() == k) {
           list.add(new ArrayList<>(tmpList));
       } else {
           for (int i = 0; i < nums.length; i++) {
               tmpList.add(nums[i]);
               backtrackPermutationsWithRepeat(list, tmpList, nums, k);
               tmpList.remove(tmpList.size() - 1);
           }
       }
    }
}
