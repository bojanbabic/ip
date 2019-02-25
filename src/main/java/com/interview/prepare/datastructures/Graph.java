package com.interview.prepare.datastructures;


import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.*;
import java.util.stream.Stream;

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

    public void DFS1(int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        List<Integer> visited = new ArrayList<>();
        while(!stack.isEmpty()) {
            Integer elem = stack.pop();
            visited.add(elem);
            System.out.println(elem);
            edgeList.get(elem).stream().forEach(e -> {
                if (!visited.contains(e)) {
                    stack.add(e);
                }
            });
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

    public void BFS1(int start) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> visited = new ArrayList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            Integer elem = queue.poll();
            System.out.println(elem + " ");
            visited.add(elem);
            edgeList.get(elem).stream().forEach(e -> {
                if (!visited.contains(e)) {
                    queue.add(e);
                }
            });
        }
    }

    public List<Integer> unweightedShortestPath(Integer from, Integer to) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Double> weights = Maps.newHashMap();
        pqueue.offer(from);
        int cost = 0;
        List<Integer> path = Lists.newArrayList();
        while (!pqueue.isEmpty()) {
            Integer elem = pqueue.poll();
            path.add(elem);
            List<Integer> n = edgeList.get(elem);
            visited.add(elem);
            for (Integer e: n) {

                if (e == to) {
                    return path;
                }

            }
        }
        return null;
    }

    public List<Integer> topSort1() {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> toppOrder = new Stack<>();
        List<Integer> visited = Lists.newArrayList();
        List<Integer> out = Lists.newArrayList();
        for (Integer edge: edgeList.keySet()) {
            if (visited.contains(edge)) {
                continue;
            }
            visited.add(edge);
            stack.push(edge);
            toppOrder.push(edge);
            while (!stack.isEmpty()) {
                int tmp = stack.pop();
                List<Integer> neighbours = edgeList.get(tmp);
                for (Integer n: neighbours) {
                    if (visited.contains(n)) {
                        continue;
                    }
                    toppOrder.push(n);
                    stack.push(n);
                    visited.add(n);
                }

            }
            while (!toppOrder.isEmpty()) out.add(toppOrder.pop());
        }
        return out;
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
//                visited.add(edge);
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
