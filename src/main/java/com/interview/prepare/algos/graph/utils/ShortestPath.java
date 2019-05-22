package com.interview.prepare.algos.graph.utils;

import java.util.Objects;

public class ShortestPath implements Comparable<ShortestPath> {
    public Vertex v;
    public Double weight;

    public ShortestPath(Vertex v, Double w) {
        this.v = v;
        this.weight = w;
    }

    @Override
    public int compareTo(ShortestPath s) {
        if (this.weight == s.weight) return 0;
        return this.weight < s.weight ? -1 : 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortestPath that = (ShortestPath) o;
        // ONLY VERTEX COMPARE!!!!
        return Objects.equals(v, that.v);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v, weight);
    }
}
