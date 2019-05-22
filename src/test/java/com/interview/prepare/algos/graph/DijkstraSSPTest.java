package com.interview.prepare.algos.graph;

import com.interview.prepare.algos.graph.utils.ShortestPath;
import com.interview.prepare.algos.graph.utils.Vertex;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DijkstraSSPTest {

    DijkstraSSP d;

    @Test
    public void testSSP() {
        d = new DijkstraSSP(4);
        Vertex v0 = d.initVertex(0);
        Vertex v1 = d.initVertex(1);
        Vertex v2 = d.initVertex(2);
        Vertex v3 = d.initVertex(3);
        Vertex v4 = d.initVertex(4);
        Vertex v5 = d.initVertex(5);
        Vertex v6 = d.initVertex(6);
        Vertex v7 = d.initVertex(7);
        Vertex v8 = d.initVertex(8);
        Vertex v9 = d.initVertex(9);
        d.addEdge(v0,v2,2.9);
        d.addEdge(v0,v1,0.1);
        d.addEdge(v1,v2,1.1);
        d.addEdge(v2,v1,1.5);
        d.addEdge(v2,v3,0.2);
        List<ShortestPath> paths = d.paths(v0, v3);
        Assert.assertEquals(new Double(1.4), paths.get(paths.size() - 1).weight);
    }

    @Test
    public void testSSP_more() {
        d = new DijkstraSSP(10);
        Vertex v0 = d.initVertex(0);
        Vertex v1 = d.initVertex(1);
        Vertex v2 = d.initVertex(2);
        Vertex v3 = d.initVertex(3);
        Vertex v4 = d.initVertex(4);
        Vertex v5 = d.initVertex(5);
        Vertex v6 = d.initVertex(6);
        Vertex v7 = d.initVertex(7);
        d.addEdge(v0, v3, 1d);
        d.addEdge(v2, v1, 3d);
        d.addEdge(v1, v4, 5d);
        d.addEdge(v1, v3, 3d);
        d.addEdge(v2, v4, 8d);
        d.addEdge(v2, v5, 5d);
        d.addEdge(v3, v4, 1d);
        d.addEdge(v3, v6, 10d);
        d.addEdge(v4, v5, 2d);
        d.addEdge(v4, v7, 8d);
        d.addEdge(v4, v6, 2d);
        d.addEdge(v5, v7, 15d);
        d.addEdge(v6, v7, 5d);
//        d.addEdge(v8, v10, 2d);
        List<ShortestPath> paths = d.paths(v0, v7);
        Assert.assertEquals(new Double(1.4), paths.get(paths.size() - 1).weight);

    }

}