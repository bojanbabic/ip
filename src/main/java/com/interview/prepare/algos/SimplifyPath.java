package com.interview.prepare.algos;

import java.util.Stack;

public class SimplifyPath {
    public String simplePath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] p = path.split("/");
        for (int i = 0; i < p.length; i++) {
            String elem = p[i];
            if (!stack.isEmpty() && elem.equals("..")) {
                stack.pop();
            } else if (!(elem.isEmpty() || elem.equals(".") || elem.equals(".."))) {
                stack.push(elem);
            }
        }
        String out = "";
        while (!stack.isEmpty()) {
            out = "/" + stack.pop() + out;
        }
        return out;
    }
}
