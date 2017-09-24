package com.interview.prepare.datastructures;

import com.interview.prepare.datastructures.BalancedTree;
import com.interview.prepare.datastructures.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/25/17.
 */
public class BalancedTreeTest {
    BalancedTree bt = new BalancedTree();
    @Test
    public void isBalanced() throws Exception {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t2.left = t3;
        t3.left = t4;
        t4.left = t5;
        assertFalse(bt.isBalanced(t1));
    }

}