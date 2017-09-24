package com.interview.prepare.datastructures;

/**
 * Created by bojan on 3/22/17.
 */

import com.interview.prepare.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinarySearchTree {

    TreeNode root;
    LinkedList<Integer> ordered = new LinkedList<Integer>();
    public BinarySearchTree(TreeNode root) {
        this.root = root;
        iterate(root);
    }

    private void iterate(TreeNode root) {
        if (root == null) return;
        if (root.left != null) iterate(root.left);
        ordered.add(root.val);
        if (root.right != null) iterate(root.right);
    }

    public String printAllPaths() {
        StringBuilder sb = new StringBuilder();
        printAllPaths(root, new ArrayList<Integer>());
        return sb.toString();
    }
    public void printAllPaths(TreeNode root, List<Integer> paths) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            paths.add(root.val);
            System.out.println(paths);
        } else {
            paths.add(root.val);
            printAllPaths(root.left, new ArrayList<Integer>(paths));
            printAllPaths(root.right, new ArrayList<Integer>(paths));
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return ordered.size() > 0;
    }

    /** @return the next smallest number */
    public int next() {
        return ordered.poll();
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
