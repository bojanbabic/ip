package com.interview.prepare.datastructures;

import java.util.Stack;

/** O(n) time and < O(n) space
 * https://www.glassdoor.com/Interview/If-your-are-given-an-Integer-Singly-linked-list-Print-it-backwards-Constraints-1-Do-not-manipulate-the-list-example-QTN_1856991.htm
 * Created by bojan on 4/8/17.
 */
public class ReverseSinglelyLinkedList {

    public String reverse(Node root) {
        Stack<Integer> stack = new Stack<Integer>();
        if (root == null) return "";
        stack.add(root.val);
        while (root.next != null) {
            root = root.next;
            stack.add(root.val);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public String reverseRecursively(Node root) {
        String s = "";
        if (root == null) return s;
        s = root.next == null ? root.val + "": reverseRecursively(root.next) + root.val;
        return s;
    }

}
