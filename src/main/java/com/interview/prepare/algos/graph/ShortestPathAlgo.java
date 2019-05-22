package com.interview.prepare.algos.graph;

import com.google.common.collect.Maps;
import com.interview.prepare.algos.graph.utils.Vertex;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ShortestPathAlgo {

    class DirectedEdge {
        private final int v, w;
        private final double weight;

        DirectedEdge(int v, int w, double weight) {
            this.v = v;
            this.w = w;
            this.weight = weight;
        }

        public int from() {return v;}
        public int to() {return w;}
        public double weight() {return weight;}
    }

    class EdgeWeightedDigraph {
        private final int n;
        private final Map<Integer, List<DirectedEdge>> adjList;

        EdgeWeightedDigraph(int n, List<Pair<DirectedEdge, DirectedEdge>> adjList) {
            this.n = n;
            this.adjList = createAdjList(adjList);
        }

        private Map<Integer, List<DirectedEdge>> createAdjList(List<Pair<DirectedEdge, DirectedEdge>> adjList) {
            Map<Integer, List<DirectedEdge>> map = Maps.newHashMap();
            adjList.stream().forEach(p -> map.computeIfAbsent(p.getKey().from(), k -> new ArrayList<DirectedEdge>()).add(p.getValue()));
            return map;
        }

        public void addDirectedEdge(DirectedEdge e) {
            this.adjList.get(e.from()).add(e);
        }

        public void singleSourceSS(int s) {
            List<DirectedEdge> edges = adjList.get(s);
        }
    }
}
