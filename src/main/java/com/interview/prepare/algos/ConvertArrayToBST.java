package com.interview.prepare.algos;

import com.interview.prepare.datastructures.TreeNode;

public class ConvertArrayToBST {
    public TreeNode convert(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = array[array.length / 2];
        TreeNode node = new TreeNode(mid);
        node.left = convert(array, 0, mid - 1);
        node.right = convert(array, mid + 1, end);
        return node;
    }
}
