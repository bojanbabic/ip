package com.programcreek.tasks.util;

import com.google.common.collect.Maps;

import java.util.HashMap;

/**
 * Created by bbabic on 9/5/17.
 */
public class Trie {
    HashMap<Character, Trie> map;
    Character c;
    Boolean leaf;

    public Trie() {
        this.map = Maps.newHashMap();
    }

    public void add(String data) {
        Trie currentTrie = this;
        for (int i = 0; i < data.length(); i++) {
            Character c = data.charAt(i);
            if (currentTrie.map.containsKey(c)) {
                currentTrie = currentTrie.map.get(c);
            } else {
                currentTrie.c = c;
                if (i == data.length() - 1) {
                    currentTrie.leaf = true;
                } else {
                    currentTrie.leaf = false;
                    currentTrie.map.put(c, new Trie());
                    currentTrie = currentTrie.map.get(c);
                }

            }
        }
    }

    public boolean search(String string) {
        Trie t = this;
        for (int i = 0; i < string.length(); i++) {
            if (t != null && t.c == string.charAt(i)) {
                if (i != string.length() - 1) {
                    t = t.map.get(t.c);
                }
            } else {
                return false;
            }
        }
        if (t.leaf) {
            return true;
        }
        return false;
    }
}
