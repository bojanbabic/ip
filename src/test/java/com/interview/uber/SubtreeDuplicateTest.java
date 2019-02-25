package com.interview.uber;

import com.interview.prepare.datastructures.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtreeDuplicateTest {
    TreeNode n1;

    @Test
    public void findAllSubtrees() {
        n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;
        n3.right = n4;

        SubtreeDuplicate sd = new SubtreeDuplicate();
//        assertEquals(2, sd.findAllSubtrees(n1).size());
        assertEquals(4, sd.findDuplicateSubtrees(n1).size());
    }
}