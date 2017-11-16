package com.interview.prepare.datastructures;


import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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

    // used to generate DAGs
    public List<Integer> topologicalSort() {
        List<Integer> topoOrder = new LinkedList<Integer>();
        Stack<Integer> reverseDag = new Stack<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> visited = new ArrayList<Integer>();
        for (Integer edge: edgeList.keySet()) {
            if (visited.contains(edge)) {
                continue;
            }
            stack.push(edge);
            visited.add(edge);
            reverseDag.push(edge);
            while (!stack.isEmpty()) {
                int tmp = stack.pop();
                visited.add(edge);
                List<Integer> nodes = edgeList.get(tmp);
                for (Integer node: nodes) {
                    if (!visited.contains(node)) {
                        stack.push(node);
                        visited.add(node);
                        reverseDag.push(node);
                    }
                }
            }
            while(!reverseDag.isEmpty()) {
                topoOrder.add(reverseDag.pop());
            }
        }
        return topoOrder;
    }

    public boolean isCycleGraph() {
        boolean isCycle = false;
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> visited = new ArrayList<Integer>();
        for (Integer edge: edgeList.keySet()) {
            stack.add(edge);
            while(!stack.isEmpty()) {
                // NOTE: peek instead of pop
                int tmp = stack.peek();
                List<Integer> nodes = edgeList.get(tmp);
                boolean nodesToProcess = false;
                for (Integer node: nodes) {
                    if (stack.contains(node)) {
                        isCycle = true;
                        return isCycle;
                    }
                    if (!visited.contains(node)) {
                        nodesToProcess = true;
                        stack.add(node);
                        visited.add(node);
                    }
                }
                if (!nodesToProcess) stack.removeAllElements();
            }
        }
        return isCycle;
    }
}
