package com.interview.prepare.recursion;

import java.util.*;

/**
 * Asked by Linkedin
 * Created by bojan on 3/7/17.
 */
public class DeserializeBST {
    public String serialize(Node node) {
        String s = "";
        if (node == null) {
            return "|,";
        }
        s += node.data + ",";
        s += serialize(node.left);
        s += serialize(node.right);
        return s;
    }

    public Node deserialize(String s) {
        Queue<String> tokens = new LinkedList<String>();
        tokens.addAll(Arrays.asList(s.split(",")));
        return buildTree(tokens);
    }

    private Node buildTree(Queue<String> tokens) {
        if (tokens.size() == 0) {
            return null;
        }
        Node n = new Node();
        String token = tokens.remove();
        if (token.equals("|")) {
            return null;
        }
        n.data = Integer.parseInt(token);
        n.left = buildTree(tokens);
        n.right = buildTree(tokens);
        return n;
    }
}
