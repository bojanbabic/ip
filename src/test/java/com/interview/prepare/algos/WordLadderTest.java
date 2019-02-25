package com.interview.prepare.algos;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class WordLadderTest {

    @Test
    public void ladderLength() {
        WordLadder wl = new WordLadder();
        List<String> dict = new LinkedList(Arrays.asList("hot","dot","dog","lot","log", "cog"));
        assertEquals(5, wl.ladderLength("hit", "cog", dict));

        List<String> dict1 = new LinkedList(Arrays.asList("hot","dot","dog","lot","log"));
        assertEquals(0, wl.ladderLength("hit", "cog", dict1));

        List<String> dict2 = new LinkedList(Arrays.asList("a", "b", "c"));
        assertEquals(2, wl.ladderLength("a", "c", dict2));

        List<String> dict3 = new LinkedList(Arrays.asList("hot", "dog"));
        assertEquals(0, wl.ladderLength("hot", "dog", dict3));

        List<String> dict4 = new LinkedList(Arrays.asList("ts","sc","ph","ca","jr","hf","to","if","ha","is","io","cf","ta"));
        assertEquals(0, wl.ladderLength("ta", "it", dict4));
    }
}