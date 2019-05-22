package com.interview.uber;

import java.util.*;

public class CourseSchedule {

    Map<Integer, List<Integer>> adjList = new HashMap<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int prev = prerequisites[i][0];
            for (int j = 1; j < prerequisites[i].length; j++) {
                adjList.computeIfAbsent(prerequisites[i][j], k -> new ArrayList<>()).add(prev);
                indegree[prev]++;
                prev = prerequisites[i][j];
            }
        }

//        buildGraph(numCourses, prerequisites);
        List<Integer> visited = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        // topological sort
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                stack.push(i);
            }
        }
        while (!stack.isEmpty()) {
            Integer v = stack.pop();
            visited.add(v);
            List<Integer> nn = adjList.get(v);
            if (nn == null) {
                continue;
            }
            for (Integer vv : nn) {
                int ind = indegree[vv];
                if (ind == 1) {
                    stack.push(vv);
                }
                indegree[vv]--;
            }
        }
        return visited.size() == numCourses;
    }
}
