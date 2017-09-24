package com.interview.prepare.datastructures;

/**
 * Created by bojan on 3/27/17.
 */
public class DetectLoop {
    static class Node {
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }

    public boolean detectNode(Node root) {
        Node cur = root;
        if (root.next == null) return false;
        Node next = root.next;
        while (!cur.equals(next)) {
            if (cur.next == null || next.next == null) return false;
            cur = cur.next;
            next = next.next.next;
        }
        return true;
    }
}
