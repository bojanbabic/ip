package com.interview.prepare.algos.graph;

import com.google.common.collect.Lists;
import com.interview.prepare.algos.graph.utils.Edge;
import com.interview.prepare.algos.graph.utils.Graph;
import com.interview.prepare.algos.graph.utils.ShortestPath;
import com.interview.prepare.algos.graph.utils.Vertex;

import java.util.*;

public class DijkstraSSP {
    Graph g;

    public DijkstraSSP(int n) {
        this.g = initGraph(n);
    }

    private Graph initGraph(int n) {return new Graph(n);}

    public Vertex initVertex(int i) {
        return new Vertex(i);
    }

    public void addEdge(Vertex from, Vertex to, Double weight) {
        this.g.adjList.get(from).add(new Edge(from, to, weight));
    }

    public List<ShortestPath> paths(Vertex start, Vertex end) {
        PriorityQueue<ShortestPath> pq = new PriorityQueue<>();
        Map<Vertex, Double> pqValues = new HashMap<>();
        Stack<ShortestPath> stack = new Stack<>();
        List<Vertex> visited = new ArrayList<>();
        List<Edge> edges = g.adjList.get(start);
        for (Edge e: edges) {
            pq.add(new ShortestPath(e.getTo(), e.getWeight()));
            pqValues.put(e.getTo(), e.getWeight());
        }
        while (!pq.isEmpty()) {
            ShortestPath shortest = pq.poll();
            stack.add(shortest);
            if (shortest.v.equals(end)) {
                return stack;
            }
            List<Edge> nedges = g.adjList.get(shortest.v);
            for (Edge ne: nedges) {
                ShortestPath p = new ShortestPath(ne.getTo(), shortest.weight + ne.getWeight());
                // avoid cycle
                if (visited.contains(p.v)) {
                    continue;
                }
                if (pq.contains(p) && p.weight < pqValues.get(p.v)) {
                    pq.remove(p);
                    pq.add(p);
                    pqValues.put(p.v, p.weight);
                } else if (!pq.contains(p)) {
                    pq.add(p);
                    pqValues.put(p.v, p.weight);
                }
            }
            visited.add(shortest.v);
        }
        return Lists.newArrayList(stack);

    }
}
