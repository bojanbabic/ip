package com.interview.prepare.algos.graph;

import com.interview.prepare.algos.graph.utils.ShortestPath;
import com.interview.prepare.algos.graph.utils.Vertex;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TopologicalSortTest {
    @Test
    public void testTopo() {
        TopologicalSort topo = new TopologicalSort(10);
        Vertex v0 = topo.initVertex(0);
        Vertex v1 = topo.initVertex(1);
        Vertex v2 = topo.initVertex(2);
        Vertex v3 = topo.initVertex(3);
        Vertex v4 = topo.initVertex(4);
        Vertex v5 = topo.initVertex(5);
        Vertex v6 = topo.initVertex(6);
        Vertex v7 = topo.initVertex(7);
        topo.addEdge(v0, v3, 1d);
        topo.addEdge(v2, v1, 3d);
        topo.addEdge(v1, v4, 5d);
        topo.addEdge(v1, v3, 3d);
        topo.addEdge(v2, v4, 8d);
        topo.addEdge(v2, v5, 5d);
        topo.addEdge(v3, v4, 1d);
        topo.addEdge(v3, v6, 10d);
        topo.addEdge(v4, v5, 2d);
        topo.addEdge(v4, v7, 8d);
        topo.addEdge(v4, v6, 2d);
        topo.addEdge(v5, v7, 15d);
        topo.addEdge(v6, v7, 5d);
        List<Vertex> paths = topo.run();
        assertEquals(paths.size(), 8);
    }

}