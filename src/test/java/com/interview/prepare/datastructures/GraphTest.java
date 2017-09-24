package com.interview.prepare.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/25/17.
 */
public class GraphTest {
    Graph g = new Graph(4);
    @Test
    public void DFS() throws Exception {
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.DFS(2);
        System.out.println("");
        g.BFS(2);
    }

}