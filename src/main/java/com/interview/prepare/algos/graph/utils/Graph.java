package com.interview.prepare.algos.graph.utils;

import com.google.common.collect.Maps;

import java.util.*;
import java.util.stream.IntStream;

public class Graph {
    public Map<Vertex, List<Edge>> adjList;
    int n;

    public Graph(int n) {
        this.n = n;
        adjList = Maps.newHashMap();
        IntStream.range(0, n).forEach(i -> adjList.put(new Vertex(i), new ArrayList<>()));
    }

    public void addEgde(Vertex from, Vertex to, Double weight) {
        this.adjList.get(from).add(new Edge(from, to, weight));
    }

    public boolean hasCycle() {
        boolean hasCycle = false;
        return hasCycle;
    }

    public List<Vertex> BFS(Vertex start) {
        Queue<Vertex> queue = new LinkedList<>();
        List<Vertex> order = new LinkedList<>();
        List<Vertex> visited = new ArrayList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            Vertex v = queue.poll();
            queue.add(v);
            visited.add(v);
            order.add(v);
            List<Edge> nedges = adjList.get(v);
            for (Edge ne : nedges) {
                if (visited.contains(ne)) {
                    continue;
                }
                queue.add(ne.to);
                visited.add(ne.to);
            }
        }
        return order;
    }

    public List<Vertex> DFS(Vertex start) {
        Stack<Vertex> stack = new Stack<>();
        List<Vertex> visited = new ArrayList<>();
        List<Vertex> order = new ArrayList<>();
        stack.push(start);
        while(!stack.isEmpty()) {
            Vertex v = stack.pop();
            if (visited.contains(v)) {
                continue;
            }
            List<Edge> edges = adjList.get(v);
            for (Edge e: edges) {
                if (visited.contains(e.to)) {
                    continue;
                }
                stack.push(e.to);
                visited.add(e.to);
                order.add(e.to);
            }
        }
        return order;
    }
}
