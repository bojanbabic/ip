package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

public class LastWordLengthTest {

    @Test
    public void lastWorkLength() {
        LastWordLength l = new LastWordLength();
        assertEquals(5, l.lastWorkLength("Geeks for Geeks"));
        assertEquals(13, l.lastWorkLength("GeeksforGeeks"));
        assertEquals(5, l.lastWorkLength("1 Geeks  "));
    }
}