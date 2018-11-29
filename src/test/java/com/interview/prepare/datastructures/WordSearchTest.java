package com.interview.prepare.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordSearchTest {

    @Test
    public void search() {
        char[][] grid = new char[][] {
                {'a', 'b', 'c', 'e'},
                {'s', 'f', 'c', 's'},
                {'a', 'd', 'e', 'e'}
        };
        WordSearch ws = new WordSearch();
        assertTrue(ws.search(grid, "abces"));
        assertTrue(ws.search(grid, "see"));
        assertFalse(ws.search(grid, "abcb"));
    }
}