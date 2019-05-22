package com.interview.uber;

import com.interview.prepare.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryZigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zz = new ArrayList<>();
        helper(root, zz, 0);
        return zz;
    }
    private void helper(TreeNode root, List<List<Integer>> zz, int level) {
        if (root == null) {
            return;
        }

        if (zz.size() <= level) {
            zz.add(new ArrayList<>());
        }

        List<Integer> curLevel = zz.get(level);
        if (level % 2 == 0) {
            curLevel.add(root.val);
        } else {
            curLevel.add(0, root.val);
        }
        helper(root.left, zz, level + 1);
        helper(root.right, zz, level + 1);
    }
}
