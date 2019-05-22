package com.interview.prepare.algos;

import com.interview.prepare.datastructures.Node;
import com.interview.prepare.datastructures.TreeNode;

import java.util.*;

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


    public void traverseInOrder_cp1(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            traverseInOrder_cp1(node.left, list);
        }
        list.add(node.val);
        if (node.right != null) {
            traverseInOrder_cp1(node.right, list);
        }
    }

    public int findKthElement(TreeNode treeNode, int k) {
        List<Integer> list = new ArrayList<Integer>();
        traverseInOrder(treeNode, list);
        return list.get(k);
    }

    public void levelByLevel(TreeNode n) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (n == null) {
            return;
        }
        List<TreeNode> currentLevel = Arrays.asList(n);
        while (!currentLevel.isEmpty()) {
            queue.addAll(currentLevel);
            currentLevel = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                System.out.print(node.val);
                if (node.left != null) {
                    currentLevel.add(node.left);
                }
                if (node.right != null) {
                    currentLevel.add(node.right);
                }
            }
            System.out.println();
        }
    }


    /**
     * https://www.geeksforgeeks.org/construct-a-binary-tree-from-postorder-and-inorder/
     * @param in
     * @param pos
     * @param startIn
     * @param inEnd
     * @param posEnd
     * @return
     */
    public TreeNode constructBinarySearchTree(int[] in, int[] pos, int startIn, int inEnd, int posEnd) {
        if (startIn > inEnd) {
            return null;
        }
        if (posEnd <= 0) {
            return null;
        }
        int rootValue = pos[posEnd];
        TreeNode node = new TreeNode(pos[posEnd]);
        if (startIn == inEnd) {
            return node;
        }
        int i = startIn;
        while(i < in.length) {
            if (in[i] == rootValue) {
                break;
            }
            i++;
        }
        node.left = constructBinarySearchTree(in, pos, startIn, i - 1, i - 1);
        node.right = constructBinarySearchTree(in, pos, i + 1, inEnd, posEnd - 1);
        return node;
    }

    public TreeNode bbstFromLinkedList(Node head, Node tail) {
        Node slow = head;
        Node fast = head;

        if (head == tail) {
            return null;
        }
        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }

        TreeNode node = new TreeNode(slow.val);
        node.left = bbstFromLinkedList(head, slow);
        node.right = bbstFromLinkedList(slow.next, tail);
        return node;
    }

    public TreeNode bbstFromArray(int[] a, int start, int end) {
        int mid = (start + end) / 2;
        if (start > end) {
            return null;
        }
        TreeNode node = new TreeNode(a[mid]);
        node.left = bbstFromArray(a, start, mid - 1);
        node.right = bbstFromArray(a, mid + 1, end);
        return node;
    }

    public int minDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = 1 + minDepth(node.left);
        int right = 1 + minDepth(node.right);
        return Math.min(left, right);
    }

    public int maxSum(TreeNode node, int currentMax) {
        if (node == null) {
            return 0;
        }

        int left = maxSum(node.left, currentMax);
        int right = maxSum(node.right, currentMax);
        currentMax = Math.max(currentMax, left + right + currentMax);
        return Math.max(left, right) + currentMax;
    }
}
