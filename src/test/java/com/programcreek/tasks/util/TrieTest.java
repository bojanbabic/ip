package com.programcreek.tasks.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bbabic on 9/5/17.
 */
public class TrieTest {

    Trie t = new Trie();

    @Test
    public void testAdd() throws Exception {
//        t.add("test");
        t.add("take");
        assertNotNull(t);
//        assertTrue(t.search("take"));
//        assertFalse(t.search("tak"));
        assertFalse(t.search("taken"));
    }
}