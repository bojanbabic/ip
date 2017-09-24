package com.interview.prepare.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/7/17.
 */
public class DeserializeBSTTest {
    DeserializeBST d = new DeserializeBST();
    @Test
    public void serialize() throws Exception {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        //n0.left = n1;
        //n0.right = n2;

        //System.out.println(d.serialize(n0));
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        System.out.println(d.serialize(n1));


    }

    @Test
    public void deserialize() throws Exception {
        String s = "0,1,|,|,2,|,|,";
        Node n = d.deserialize(s);
        assertEquals(0, n.data);
    }

}