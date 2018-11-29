package com.interview.prepare.datastructures;

import com.google.common.base.Joiner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by bojan on 4/8/17.
 */
@RunWith(JUnit4.class)
public class BinarySearchTreeTest {
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
    public void printAllPaths() throws Exception {
        BinarySearchTree tree = new BinarySearchTree(n1);
        assertEquals("12\n134", tree.printAllPaths());
        assertEquals("2134", Joiner.on("").join(tree.inorder()));
    }

}