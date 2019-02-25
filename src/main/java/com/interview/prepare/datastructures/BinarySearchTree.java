package com.interview.prepare.datastructures;

/**
 * Created by bojan on 3/22/17.
 */

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
        List<List<Integer>> paths = new LinkedList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        printAllPaths(root, path, paths);
        return paths.toString();
    }
    public void printAllPaths(TreeNode root, List<Integer> path, List<List<Integer>> paths) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            path.add(root.val);
            paths.add(path);
            System.out.println(path);
        } else {
            path.add(root.val);
            printAllPaths(root.left, new ArrayList<Integer>(path), paths);
            printAllPaths(root.right, new ArrayList<Integer>(path), paths);
        }
    }

    public int maxBranch() {
        return maxBranchHelper(this.root);
    }

    public int maxBranchHelper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftPath = maxBranchHelper(root.left);
        int rightPath = maxBranchHelper(root.right);
        int maxPath = 1 + Math.max(leftPath, rightPath);
        return maxPath;
    }

    public List<Integer> inorder() {
        List<Integer> list = new LinkedList<Integer>();
        inorder(list, this.root);
        return list;
    }

    private void inorder(List<Integer> nodes, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) inorder(nodes, root.left);
        nodes.add(root.val);
        if (root.right != null) inorder(nodes, root.right);
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
