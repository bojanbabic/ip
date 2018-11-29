package com.interview.prepare.datastructures;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Created by bbabic on 10/22/17.
 */
public class WeightedGraph {
    public Vertex initVertex(int i) {
        return new Vertex(i);
    }

    public Edge initEdge(Vertex from, Vertex to, double weight) {
        return new Edge(from, to, weight);
    }

    class Edge implements Comparable<Edge> {
        Vertex from;
        Vertex to;
        double weight;

        public Edge(final Vertex from, final Vertex to, final double weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Edge edge = (Edge) o;
            return Double.compare(edge.weight, weight) == 0 &&
                   Objects.equals(from, edge.from) &&
                   Objects.equals(to, edge.to);
        }

        public int compareTo(Edge e) {
            if (this.weight == e.weight) return 0;
            return this.weight > e.weight ? 1 : -1;
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to, weight);
        }
    }
    public class Vertex {
        int val;
        public Vertex(final int val) {
            this.val = val;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Vertex vertex = (Vertex) o;
            return val == vertex.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

    class ShortestPath implements Comparable<ShortestPath> {
        Vertex v;
        double weight;

        public ShortestPath(final Vertex v, final double weight) {
            this.v = v;
            this.weight = weight;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ShortestPath that = (ShortestPath) o;
            return Objects.equals(v, that.v);
        }

        @Override
        public int hashCode() {
            return Objects.hash(v);
        }

        public int compareTo(final ShortestPath o) {
            if (this.v.val == o.v.val) return 0;
            return this.v.val > o.v.val ? 1 : -1;
        }
    }

    int n;
    Map<Vertex, List<Edge>> graph;

    public WeightedGraph(int n) {
        this.n = n;
        graph = Maps.newHashMap();
        for (int i = 0; i < n; i++) {
            graph.put(new Vertex(i), new ArrayList<Edge>());
        }
    }

    public void addEdge(Vertex from, Vertex to, double weight) {
        this.graph.get(from).add(new Edge(from, to, weight));
    }

    // Dijkstra
    public List<ShortestPath> shortestPath(Vertex s) {
        PriorityQueue<ShortestPath> pq = new PriorityQueue<ShortestPath>();
        Map<Vertex, Double> pqVals = Maps.newHashMap();
        Stack<ShortestPath> sp = new Stack<ShortestPath>();
        List<Edge> adj = graph.get(s);
        for (Edge edge: adj) {
            pq.add(new ShortestPath(edge.to, edge.weight));
            pqVals.put(edge.to, edge.weight);
        }
        while(!pq.isEmpty()) {
            ShortestPath shortest = pq.poll();
            sp.add(shortest);
            List<Edge> a = graph.get(shortest.v);
            for (Edge e: a) {
                ShortestPath p = new ShortestPath(e.to, shortest.weight + e.weight);
                // TODO pq java impl does not allow update  of values!!!
                if (pq.contains(p) && p.weight < pqVals.get(e.to) || !pq.contains(p)) {
                    pq.add(p);
                    pqVals.put(p.v, p.weight);
                }
            }
        }
        return Lists.newArrayList(sp.iterator());
    }
}
