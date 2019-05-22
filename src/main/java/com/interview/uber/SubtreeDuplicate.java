package com.interview.uber;

import com.interview.prepare.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubtreeDuplicate {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> duplicates = new ArrayList<>();
        Map<String, Integer> cnts = new HashMap<>();
        postOrder(root, duplicates, cnts);
        return duplicates;
    }

    public List<List<TreeNode>> findAllSubtrees(TreeNode root) {
        List<List<TreeNode>> allSubtrees = new ArrayList<>();
        List<TreeNode> currentList = new ArrayList<>();
        findAllSubtreesHelper(root, currentList, allSubtrees);
        return allSubtrees;
    }

    public String postOrder(TreeNode root, List<TreeNode> duplicates, Map<String, Integer> cnts) {
        if (root == null) {
            return "#";
        }
        String serial = root.val + "|" + postOrder(root.left, duplicates, cnts) + "|" + postOrder(root.right, duplicates, cnts);
        if (cnts.getOrDefault(serial, 0) == 1) {
            duplicates.add(root);
        }
        cnts.put(serial, 1);
        return serial;
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


}
