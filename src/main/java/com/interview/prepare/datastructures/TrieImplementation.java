package com.interview.prepare.datastructures;

import java.util.HashMap;

/**
 * Created by bojan on 2/21/17.
 */
public class TrieImplementation {
    class Trie {
        Character value;
        HashMap<Character, Trie> children;
        public Trie() {
            this.children = new HashMap<Character, Trie>();
        }
    }

    private Trie t = new Trie();

    public void insert(String s) {
        int level = s.length();
        Trie root = t;
        for (int i = 0; i < level; i++) {
            HashMap<Character, Trie> children = root.children;
            Character c = s.charAt(i);
            if (children.get(c) != null) {
                root = children.get(c);
            } else {
                Trie t = new Trie();
                t.value = c;
                root.children.put(c, t);
                root = t;
            }
        }
    }

    public String find(String s) {
        String out = "";
        int level = s.length();
        Trie root = t;
        for (int i = 0; i < level; i++) {
            if (root.children.get(s.charAt(i)) == null) {
                return null;
            } else {
                root = root.children.get(s.charAt(i));
                out += s.charAt(i);
            }
        }
        return out;
    }
}
