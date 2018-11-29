package com.interview.prepare.algos;

import com.interview.prepare.datastructures.BinarySearchTree;
import com.interview.prepare.datastructures.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinarySearchTreeOpsTest {

    @Test
    public void traverseInOrder() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;
        n3.right = n4;
        BinarySearchTreeOps bstOps = new BinarySearchTreeOps();
        List<Integer> list = new ArrayList<Integer>();
        assertEquals(3, bstOps.findKthElement(n1, 2));
    }
}