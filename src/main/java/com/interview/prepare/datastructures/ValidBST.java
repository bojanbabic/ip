package com.interview.prepare.datastructures;

import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/validate-binary-search-tree
 * Created by bojan on 3/25/17.
 */
public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    /*
           f:4            t:2                     f:10
           /   \           / \                     /  \
          3     6         1   3                   5   20
         / \   /                                /  \
        1   5 2                                15   6
    */

    private boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val < min) return false;
        if (root.val > max) return false;
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }

    private boolean isValidBSTCarry(TreeNode root, int carry) {
        if (root.left != null) {
            if (root.val <= root.left.val) {
                return false;
            } else if (root.left.val >= carry) {
                return false;
            } else {
                return isValidBSTCarry(root.left, Math.max(carry, root.val));
            }
        }
        else if (root.right != null) {
            if (root.right.val <= carry) {
                return false;
            }
            if (root.val >= root.right.val) {
                return false;
            } else {
                return isValidBSTCarry(root.right, Math.min(carry, root.val));
            }
        } else {
            return true;
        }
    }

    TreeNode reconstructPreOrderSerialization(String[] order) {
        Integer rootVal = Integer.parseInt(order[0]);
        TreeNode t = new TreeNode(rootVal);
        return t;
    }
}
