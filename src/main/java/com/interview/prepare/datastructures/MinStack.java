package com.interview.prepare.datastructures;

import java.util.LinkedList;
import java.util.List;

public class MinStack {

    class Node {
        int i;
        int min;
        Node(int i, int min) {
            this.i = i;
            this.min = min;
        }
    }

    List<Node> stack;
    public MinStack() {
        this.stack = new LinkedList<>();
    }

    public void push(int x) {
        if (stack.size() == 0) {
            stack.add(0, new Node(x, Math.min(x, x)));
        } else {
            stack.add(0, new Node(x, Math.min(x, stack.get(0).min)));
        }
    }

    public void pop() {
        if (stack.size() > 0) stack.get(0);
    }

    public int top() {
        if (stack.size() > 0) {
            return stack.get(0).i;
        } else {
            return -1;
        }

    }

    public int getMin() {
        if (stack.size() > 0) {
            return stack.get(0).min;
        } else {
            return -1;
        }
    }
}
