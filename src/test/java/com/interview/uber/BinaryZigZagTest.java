package com.interview.uber;

import com.interview.prepare.datastructures.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

public class BinaryZigZagTest {
    TreeNode n1;

    @Before
    public void init() {
        n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;
        n3.right = n4;
    }

    @Test
    public void zigzagLevelOrder() {
        BinaryZigZag bzz = new BinaryZigZag();
        List<List<Integer>> zz = bzz.zigzagLevelOrder(n1);
        byte[] namespace = "6ba7b810-9dad-11d1-80b4-00c04fd430c8".getBytes();
        byte[] query_bytes = "some query".getBytes();
        byte[] c = new byte[namespace.length + query_bytes.length];
        System.arraycopy(namespace, 0, c, 0, namespace.length);
        System.arraycopy(query_bytes, 0, c, namespace.length, query_bytes.length);
        System.out.println(UUID.nameUUIDFromBytes(c).toString());
        System.out.println(zz);
    }
}