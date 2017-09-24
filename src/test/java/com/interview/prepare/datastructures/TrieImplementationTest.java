package com.interview.prepare.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 2/21/17.
 */
public class TrieImplementationTest {
    TrieImplementation ti = new TrieImplementation();
    @Test
    public void insert() throws Exception {
        ti.insert("insert");
        ti.insert("inactive");
        ti.insert("are");
        ti.insert("area");
        ti.insert("base");
        ti.insert("cat");
        ti.insert("cater");
        ti.insert("basement");
        assertEquals("insert", ti.find("insert"));
        assertEquals("inactive", ti.find("inactive"));
        assertEquals("basement", ti.find("basement"));
        assertEquals("are", ti.find("are"));
        assertNull(ti.find("arex"));
        assertNull(ti.find("basementz"));
        assertNull(ti.find("inactiva"));
    }

}