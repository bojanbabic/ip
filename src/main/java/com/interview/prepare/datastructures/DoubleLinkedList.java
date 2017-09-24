package com.interview.prepare.datastructures;

/**
 * Created by bojan on 2/19/17.
 */
public class DoubleLinkedList {
    class Node {
        int value;
        Node prev;
        Node next;
    }

    public void removeFromList(Node root, int value) {
        if (root.value == value) {
            if (root.prev != null) {
                root.prev.next = root.next;
            }
            if (root.next != null) {
                root.next.prev = root.prev;
            }
        } else {
            removeFromList(root.next, value);
        }
    }
}
