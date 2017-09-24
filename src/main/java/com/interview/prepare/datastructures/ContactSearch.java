package com.interview.prepare.datastructures;

import java.util.HashMap;

/**
 * http://www.geeksforgeeks.org/implement-a-phone-directory/
 * Created by bojan on 2/26/17.
 */
public class ContactSearch {

    class Trie {
        int cnt;
        HashMap<Character, Trie> children;

        public Trie() {
            this.cnt = 1;
            this.children = new HashMap<Character, Trie>();
        }
    }

    Trie contacts = new Trie();

    public void addContact(String contact) {
        Trie currentNode = contacts;
        for (int i = 0; i < contact.length(); i++) {
            if (currentNode.children.containsKey(contact.charAt(i))) {
                Trie tt = currentNode.children.get(contact.charAt(i));
                tt.cnt++;
                currentNode = currentNode.children.get(contact.charAt(i));
            } else {
                Trie node = new Trie();
                currentNode.children.put(contact.charAt(i), node);
                currentNode = node;
            }

        }
    }

    public int find(String contact) {
        if (contact == null) {
            return 0;
        }
        Trie currentNode = contacts;
        for (int i = 0; i < contact.length(); i++) {
            if (!currentNode.children.containsKey(contact.charAt(i))) {
               return 0;
            }
            currentNode = currentNode.children.get(contact.charAt(i));
        }
        return currentNode.cnt;
    }
}
