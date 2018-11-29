package com.programcreek.tasks;

import com.programcreek.tasks.util.Trie;

/**
 * Created by bbabic on 9/5/17.
 */
public class LongestPrefix {
    Trie t;
    public String findLongestPrefix(String[] input) {
        return null;
    }

    private void addToTie(String[] input) {
        for (String i: input) {
            t.add(i);
        }
    }
}
