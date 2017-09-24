package com.interview.prepare.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/25/17.
 */
public class ValidBSTTest {
    ValidBST validBST = new ValidBST();

    @Test
    public void invalidBST() throws Exception {
        TreeNode t4 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3);
        TreeNode t6 = new TreeNode(6);
        TreeNode t1 = new TreeNode(1);
        TreeNode t5 = new TreeNode(5);
        TreeNode t2 = new TreeNode(2);

        t4.left = t3;
        t4.right = t6;
        t3.left = t1;
        t3.right = t5;
        t6.left = t2;

        assertFalse(validBST.isValidBST(t4));
    }
    @Test
    public void isValidBST() throws Exception {
        TreeNode t10 = new TreeNode(10);
        TreeNode t5 = new TreeNode(5);
        TreeNode t15 = new TreeNode(15);
        TreeNode t6 = new TreeNode(6);
        TreeNode t20 = new TreeNode(20);

        t10.left = t5;
        t5.left = t15;
        t5.right = t6;
        t10.right = t20;

        assertFalse(validBST.isValidBST(t10));
    }

    @Test
    public void isValidBSTTest() throws Exception {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        t4.left = t3;
        t4.right = t6;
        t6.left = t2;
        t3.left = t1;
        t3.right = t5;
        assertFalse(validBST.isValidBST(t4));
    }


}