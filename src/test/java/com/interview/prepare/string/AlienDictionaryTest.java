package com.interview.prepare.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/8/17.
 */
public class AlienDictionaryTest {
    AlienDictionary ad = new AlienDictionary();
    @Test
    public void findDictionary() throws Exception {
        String[] words = new String[]{"baa", "abcd", "abca", "cab", "cad"};
        assertEquals("bdac", ad.alienOrder(words));
    }

}