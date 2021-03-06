package com.interview.prepare.string;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.*;

/**
 * Created by bojan on 3/8/17.
 */
public class AlienDictionary {
    Map<Character, List<Character>> graph = new HashMap<Character, List<Character>>();

    public String alienOrder(String[] words) {
        buildGraph(words);
        return topoOrder();
    }

    private void buildGraph(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            String current = words[i];
            String next = words[i + 1];
            int length = Math.min(current.length(), next.length());
            for (int j = 0; j < length; j++) {
                char c = current.charAt(j);
                char n = next.charAt(j);
                if (c != n) {
                    List<Character> adj = new ArrayList<Character>();
                    if (graph.containsKey(c)) {
                        adj = graph.get(c);
                    }
                    adj.add(n);
                    graph.put(c, adj);
                    break;
                }
            }
        }
    }

    private String topoOrder() {
        List<Character> visited = Lists.newArrayList();
        Stack<Character> topoOrder = new Stack<>();
        Stack<Character> stack = new Stack<>();
        List<Character> ordered = Lists.newArrayList();
        for (Character c: graph.keySet()) {
            if (visited.contains(c)) {
                continue;
            }
            visited.add(c);
            stack.push(c);
            topoOrder.push(c);
            while (!stack.isEmpty()) {
                Character t = stack.pop();
                List<Character> neighbours = graph.get(t);
                if (neighbours == null) continue;
                for (Character n: neighbours) {
                    if (visited.contains(n)) {
                        continue;
                    }
                    visited.add(n);
                    stack.push(n);
                    topoOrder.push(n);
                }
            }
            while (!topoOrder.isEmpty()) ordered.add(topoOrder.pop());
        }
        return Joiner.on("").join(ordered);
    }

    public String alienOrderBFS(String[] words) {
        Map<Character, Set<Character>> map = new HashMap<Character, Set<Character>>();
        Map<Character, Integer> degree = new HashMap<Character, Integer>();
        for (String w : words) {
            for (char c : w.toCharArray()) {
                degree.put(c, 0);
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            String current = words[i];
            String next = words[i + 1];
            int length = Math.min(current.length(), next.length());
            for (int j = 0; j < length; j++) {
                char c = current.charAt(j);
                char n = next.charAt(j);
                if (c != n) {
                    Set<Character> neighbours = new HashSet<Character>();
                    if (map.containsKey(c)) {
                        neighbours = map.get(c);
                    }
                    neighbours.add(n);
                    map.put(c, neighbours);
                    degree.put(n, degree.get(n) + 1);
                    break;
                }
            }
        }

        Queue<Character> queue = new LinkedList<Character>();
        for (Character c : degree.keySet()) {
            if (degree.get(c) == 0) {
                queue.add(c);
            }
        }

        String result = "";
        while (!queue.isEmpty()) {
            char c = queue.poll();
            result += c;
            if (map.containsKey(c)) {
                for (Character n : map.get(c)) {
                    degree.put(n, degree.get(n) - 1);
                    if (degree.get(n) == 0) queue.add(n);
                }
            }
        }
        if (result.length() != degree.size()) return "";
        return result;
    }
}
