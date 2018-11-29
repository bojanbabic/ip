package com.interview.prepare.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 4/8/17.
 */
public class BinarySearchTreeTest {
    @Test
    public void printAllPaths() throws Exception {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;
        n3.right = n4;
        BinarySearchTree tree = new BinarySearchTree(n1);
        assertEquals("12\n134", tree.printAllPaths());
    }

}