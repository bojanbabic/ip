package com.interview.uber;

import java.util.*;
import java.util.stream.IntStream;

//  TODO reimplememnt this too slow
public class JumpingGame {
    Map<Integer, List<Integer>> adjMatrix = new HashMap<>();

    private void generateMatrix(int[] nums) {
        IntStream.range(0, nums.length).forEach(i -> {
            IntStream.range(1, nums[i] + 1).forEach(k -> {
                        if (i + k < nums.length) {
                            adjMatrix.computeIfAbsent(i, z -> new ArrayList<>()).add(i + k);
                        }
                    }
            );
        });
    }

    public boolean canJump(int[] nums) {
        generateMatrix(nums);
        Integer target = nums.length - 1;
        Stack<Integer> stack = new Stack<>();
        List<Integer> visited = new ArrayList<>();
        stack.push(0);
        while (!stack.isEmpty()) {
            Integer c = stack.pop();
            if (c == target) {
                return true;
            }
            if (!adjMatrix.keySet().contains(c)) {
                continue;
            }
            List<Integer> nn = adjMatrix.get(c);
            for (Integer n : nn) {
                if (visited.contains(n)) {
                    continue;
                }
                visited.add(n);
                stack.add(n);
            }
        }
        return false;
    }
}
