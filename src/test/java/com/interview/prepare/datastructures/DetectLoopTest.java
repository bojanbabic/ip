package com.interview.prepare.datastructures;

import com.interview.prepare.datastructures.DetectLoop.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/27/17.
 */
public class DetectLoopTest {
    DetectLoop dl = new DetectLoop();
    @Test
    public void detectNode() throws Exception {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n2;

        assertTrue(dl.detectNode(n1));
    }

}