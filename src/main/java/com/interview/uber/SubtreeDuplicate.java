package com.interview.uber;

import com.interview.prepare.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SubtreeDuplicate {
    public List<List<TreeNode>> findDuplicateSubtrees(TreeNode root) {
        List<List<TreeNode>> allSubtrees = new ArrayList<>();
        List<TreeNode> currentList = new ArrayList<>();
        findDuplicateSubtreesHelper(root, currentList, allSubtrees);
        return allSubtrees;
    }

    public List<List<TreeNode>> findAllSubtrees(TreeNode root) {
        List<List<TreeNode>> allSubtrees = new ArrayList<>();
        List<TreeNode> currentList = new ArrayList<>();
        findAllSubtreesHelper(root, currentList, allSubtrees);
        return allSubtrees;
    }


    public void findAllSubtreesHelper(TreeNode root, List<TreeNode> current, List<List<TreeNode>> allSubtrees) {
        if (root == null) {
            return;
        } else {
            current.add(root);
            if (root.left == null && root.right == null) {
                allSubtrees.add(current);
                return;
            }
            if (root.left != null) {
                findAllSubtreesHelper(root.left, new ArrayList<>(current), allSubtrees);
            }
            if (root.right != null) {
                findAllSubtreesHelper(root.right, new ArrayList<>(current), allSubtrees);
            }
        }
    }

    public void findDuplicateSubtreesHelper(TreeNode root, List<TreeNode> current, List<List<TreeNode>> allSubtrees) {
        if (root == null) {
            return;
        } else {
            current.add(root);
            if (root.left == null && root.right == null) {
                allSubtrees.add(current);
                return;
            }
            if (root.left != null) {
                findAllSubtreesHelper(root.left, new ArrayList<>(current), allSubtrees);
                List<TreeNode> sublist = new ArrayList<>();
                sublist.add(root);
                allSubtrees.add(sublist);
                findAllSubtreesHelper(root.left, sublist, allSubtrees);
            }
            if (root.right != null) {
                findAllSubtreesHelper(root.right, new ArrayList<>(current), allSubtrees);
                List<TreeNode> sublist = new ArrayList<>();
                sublist.add(root);
                allSubtrees.add(sublist);
                findAllSubtreesHelper(root.right, sublist, allSubtrees);
            }
        }
    }
}
