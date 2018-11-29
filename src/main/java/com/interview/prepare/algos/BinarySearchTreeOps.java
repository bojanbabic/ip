package com.interview.prepare.algos;

import com.interview.prepare.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeOps {
    void traverseInOrder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            list.add(node.val);
            return;
        }
        traverseInOrder(node.left, list);
        list.add(node.val);
        traverseInOrder(node.right, list);
    }

    public int findKthElement(TreeNode treeNode, int k) {
        List<Integer> list = new ArrayList<Integer>();
        traverseInOrder(treeNode, list);
        return list.get(k);
    }
}
