package com.interview.prepare.datastructures;

/**
 * Created by bojan on 3/25/17.
 */
public class BalancedTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.abs(left - right) <= 1 && left >= 0 && right >= 0;
    }

    private int getHeight(TreeNode root) {
        if (root == null) return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if (Math.abs(left - right) > 1 || left < 0 || right < 0) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}
