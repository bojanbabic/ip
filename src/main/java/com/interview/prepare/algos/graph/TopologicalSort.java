package com.interview.prepare.algos.graph;

import com.interview.prepare.algos.graph.utils.Edge;
import com.interview.prepare.algos.graph.utils.Graph;
import com.interview.prepare.algos.graph.utils.Vertex;

import java.util.*;
import java.util.stream.Collectors;

public class TopologicalSort {
    Graph g;
    public TopologicalSort(int n) {
        this.g = new Graph(n);
    }

    public Vertex initVertex(int i) {
        return new Vertex(i);
    }

    public void addEdge(Vertex from, Vertex to, Double weight) {
        this.g.adjList.get(from).add(new Edge(from, to, weight));
    }

    public List<Vertex> run() {
        Set<Vertex> vertices = g.adjList.keySet();
        List<Vertex> topoOrder = new LinkedList<>();
        Stack<Vertex> stack = new Stack<>();
        List<Vertex> visited = new ArrayList<>();
        Stack<Vertex> reverseDag = new Stack<>();
        // TODO sort by indegree
        Map<Vertex, Long> allVertices = g.adjList
                .values()
                .stream()
                .flatMap(e -> e.stream())
                .collect(Collectors.groupingBy(Edge::getTo, Collectors.counting()));
        for (Vertex v: allVertices.keySet()) {
            if (visited.contains(v)) {
                continue;
            }
            stack.add(v);
            visited.add(v);
            topoOrder.add(v);
            while (!stack.isEmpty()) {
                Vertex sv = stack.pop();
                List<Edge> edges = g.adjList.get(sv);
                for (Edge e: edges) {
                    if (!visited.contains(e.getTo())) {
                        visited.add(e.getTo());
                        reverseDag.push(e.getTo());
                        stack.push(e.getTo());
                    }
                }

                while(!reverseDag.isEmpty()) {
                    topoOrder.add(reverseDag.pop());
                }
            }
        }
        return topoOrder;
    }
}
