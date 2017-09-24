package com.interview.prepare.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 4/8/17.
 */
public class ReverseSinglelyLinkedListTest {
    ReverseSinglelyLinkedList r = new ReverseSinglelyLinkedList();
    @Test
    public void reverse() throws Exception {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        n1.next = n2; n2.next = n3;
        n3.next = n4; n4.next = n5;
        n5.next = n6; n6.next = n7;
        n7.next = n8;

        assertEquals("87654321", r.reverse(n1));
        assertEquals("87654321", r.reverseRecursively(n1));
    }

}