package com.interview.prepare.algos.graph.utils;

import java.util.Objects;

public class Vertex {
    int val;

    public void setDegree(long degree) {
        this.degree = degree;
    }

    long degree;

    public Vertex(int val) {
        this.val = val;
        this.degree = 0;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "val=" + val +
                ", degree=" + degree +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return val == vertex.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
