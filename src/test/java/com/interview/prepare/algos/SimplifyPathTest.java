package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimplifyPathTest {

    @Test
    public void simplePath() {
        SimplifyPath sp = new SimplifyPath();
        assertEquals("/home", sp.simplePath("/home/"));
        assertEquals("/c", sp.simplePath("/a/./b/../../c/"));
        assertEquals("/c", sp.simplePath("/a/../../b/../c//.//"));
        assertEquals("/a/b/c", sp.simplePath("/a//b////c/d//././/.."));
    }
}