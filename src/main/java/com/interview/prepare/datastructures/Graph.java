package com.interview.prepare.datastructures;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.List;
import java.util.Stack;

/**
 * Created by bojan on 3/25/17.
 */
public class Graph {
    int n;
    Map<Integer, List<Integer>> edgeList = new HashMap<Integer, List<Integer>>();

    public Graph(int n) {
        this.n = n;
        for (int i = 0; i < n; i++) {
            edgeList.put(i, new LinkedList<Integer>());
        }
    }

    public void addEdge(int from, int to) {
        edgeList.get(from).add(to);
    }

    public void DFS(int start) {
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> visited = new ArrayList<Integer>();
        visited.add(start);
        stack.push(start);
        while (!stack.isEmpty()) {
            Integer tmp = stack.pop();
            System.out.print(tmp + " ");
            List<Integer> edges = edgeList.get(tmp);
            for (Integer edge: edges) {
                if (!visited.contains(edge)) {
                    stack.add(edge);
                    visited.add(edge);
                }
            }
        }
    }

    public void BFS(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        List<Integer> visited = new LinkedList<Integer>();
        q.add(start);
        visited.add(start);
        while(!q.isEmpty()) {
            Integer tmp = q.poll();
            System.out.print(tmp + " ");
            List<Integer> edges = edgeList.get(tmp);
            for (Integer edge: edges) {
                if (!visited.contains(edge)) {
                    visited.add(edge);
                    q.add(edge);
                }
            }
        }
    }
}
