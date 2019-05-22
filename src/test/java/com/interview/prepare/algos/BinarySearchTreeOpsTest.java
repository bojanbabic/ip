package com.interview.prepare.algos;

import com.interview.prepare.datastructures.BinarySearchTree;
import com.interview.prepare.datastructures.Node;
import com.interview.prepare.datastructures.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class BinarySearchTreeOpsTest {
    private static BinarySearchTreeOps ops = new BinarySearchTreeOps();

    @Test
    public void traverseInOrder() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;
        n3.right = n4;
        List<Integer> expected = Arrays.asList(2, 1, 3, 4);
        List<Integer> inorder = new ArrayList<>();
//        ops.traverseInOrder(n1, inorder);
        ops.traverseInOrder_cp1(n1, inorder);
        assertArrayEquals(expected.toArray(), inorder.toArray());
    }

    @Test
    public void findKthElement() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;
        n3.right = n4;
        List<Integer> list = new ArrayList<Integer>();
        assertEquals(3, ops.findKthElement(n1, 2));
    }

    @Test
    public void printLevelByLevel() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;
        n3.right = n4;
        ops.levelByLevel(n1);
    }

    @Test
    public void testBinarySearchTreeReconstruct() {
        int[] in = {4, 8, 2, 5, 1, 6, 3, 7};
        int[] pos = {8, 4, 5, 2, 6, 7, 3, 1};
        List<Integer> intBoxed = Arrays.stream(in).boxed().collect(Collectors.toList());
        TreeNode node = ops.constructBinarySearchTree(in, pos, 0, in.length - 1, pos.length - 1);
        List<Integer> inorder = new BinarySearchTree(node).inorder();
    }

    @Test
    public void testBbstFromLinkedList() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        TreeNode node = ops.bbstFromLinkedList(node1, null);
        node.toString();
    }

    @Test
    public void testBbstFromArray() {
        int[] a = {1, 2, 3};
        TreeNode node = ops.bbstFromArray(a, 0, a.length - 1);
        node.toString();
    }

    @Test
    public void testMinDepth() {
        TreeNode node3 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        node3.left = node9;
        node3.right = node20;
        node20.left = node15;
        node20.right = node7;
        assertEquals(2, ops.minDepth(node3));
    }
}