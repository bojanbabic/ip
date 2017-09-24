package com.interview.prepare.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 2/26/17.
 */
public class ContactSearchTest {
    ContactSearch cs = new ContactSearch();

    @Test
    public void find() throws Exception {
        cs.addContact("hack");
        cs.addContact("hackerrank");
        assertEquals(2, cs.find("hac"));
        assertEquals(0, cs.find("hak"));
    }

}