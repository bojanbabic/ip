package com.interview.prepare.algos.graph.utils;

public class Edge {
    Vertex from;
    Vertex to;
    Double weight;

    public Vertex getFrom() {
        return from;
    }

    public void setFrom(Vertex from) {
        this.from = from;
    }

    public Vertex getTo() {
        return to;
    }

    public void setTo(Vertex to) {
        this.to = to;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Edge(Vertex from, Vertex to, Double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}
