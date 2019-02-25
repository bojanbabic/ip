package com.interview.prepare.datastructures;

import com.google.common.base.Joiner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/25/17.
 */
@RunWith(JUnit4.class)
public class GraphTest {
    Graph g;
    @Before
    public void init() {
        g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
    }

    @Test
    public void DFS() throws Exception {
        g.DFS(2);
        System.out.println("");
        g.DFS1(2);
        System.out.println("");
        g.BFS1(2);
        g.BFS(2);
    }

    @Test
    public void topologicalSort() {
//        assertEquals("0123", Joiner.on("").join(g.topologicalSort()));
        g = new Graph(7);
        g.addEdge(0,5);
        g.addEdge(0,2);
        g.addEdge(0,1);
        g.addEdge(3,6);
        g.addEdge(3,5);
        g.addEdge(3,4);
        g.addEdge(5,2);
        g.addEdge(6,4);
        g.addEdge(6,0);
        g.addEdge(3,2);
        g.addEdge(1,4);
        assertEquals("4125063", Joiner.on("").join(g.topSort1()));
    }

    @Test
    public void isCycle() {
        g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,0);
        assertTrue(g.isCycleGraph());
        g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(0,2);
        g.addEdge(2,1);
        g.addEdge(2,3);
        g.addEdge(3,3);
        assertTrue(g.isCycleGraph());
        g = new Graph(7);
        g.addEdge(0,5);
        g.addEdge(0,2);
        g.addEdge(0,1);
        g.addEdge(3,6);
        g.addEdge(3,5);
        g.addEdge(3,4);
        g.addEdge(5,2);
        g.addEdge(6,4);
        g.addEdge(6,0);
        g.addEdge(3,2);
        g.addEdge(1,4);
        assertFalse(g.isCycleGraph());
    }

}