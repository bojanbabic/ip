package com.interview.prepare.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by bbabic on 10/22/17.
 */
public class WeightedGraphTest {
    WeightedGraph wg;

    @Before
    public void init() {
    }

    @Test
    public void testShortestPath() throws Exception {
        wg = new WeightedGraph(4);
        WeightedGraph.Vertex v0 = wg.initVertex(0);
        WeightedGraph.Vertex v1 = wg.initVertex(1);
        WeightedGraph.Vertex v2 = wg.initVertex(2);
        WeightedGraph.Vertex v3 = wg.initVertex(3);
        WeightedGraph.Vertex v4 = wg.initVertex(4);
        WeightedGraph.Vertex v5 = wg.initVertex(5);
        WeightedGraph.Vertex v6 = wg.initVertex(6);
        WeightedGraph.Vertex v7 = wg.initVertex(7);
        WeightedGraph.Vertex v8 = wg.initVertex(8);
        WeightedGraph.Vertex v9 = wg.initVertex(9);
        wg.addEdge(v0,v2,2.9);
        wg.addEdge(v0,v1,0.1);
        wg.addEdge(v1,v2,1.1);
        wg.addEdge(v2,v1,1.5);
        wg.addEdge(v2,v3,0.2);
//        Assert.assertEquals(1.4, wg.shortestPath(v0, v3));

        WeightedGraph.Vertex v10 = wg.initVertex(10);
        wg = new WeightedGraph(10);
        wg.addEdge(v0, v3, 1);
        wg.addEdge(v2, v1, 3);
        wg.addEdge(v1, v4, 5);
        wg.addEdge(v1, v3, 3);
        wg.addEdge(v2, v4, 8);
        wg.addEdge(v2, v5, 5);
        wg.addEdge(v3, v4, 1);
        wg.addEdge(v3, v6, 10);
        wg.addEdge(v4, v5, 2);
        wg.addEdge(v4, v7, 8);
        wg.addEdge(v4, v6, 2);
        wg.addEdge(v5, v7, 15);
        wg.addEdge(v6, v7, 5);
        wg.addEdge(v8, v10, 2);
        wg.shortestPath(v0, v10);
    }
}