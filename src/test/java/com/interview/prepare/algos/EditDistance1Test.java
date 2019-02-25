package com.interview.prepare.algos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EditDistance1Test {

    EditDistance1 editDistance1;


    @Before
    public void setup() {
        editDistance1 = new EditDistance1();
    }

    @Test
    public void minEditDistance() {
        assertArrayEquals("est".toCharArray(), editDistance1.deleteChar("test".toCharArray(), 0));
        assertArrayEquals("tet".toCharArray(), editDistance1.deleteChar("test".toCharArray(), 2));
        assertArrayEquals("tes".toCharArray(), editDistance1.deleteChar("test".toCharArray(), 3));
    }

    @Test
    public void insertEditDistance() {
        assertArrayEquals("atest".toCharArray(), editDistance1.inserChar("test".toCharArray(), 0));
        assertArrayEquals("teast".toCharArray(), editDistance1.inserChar("test".toCharArray(), 2));
        assertArrayEquals("testa".toCharArray(), editDistance1.inserChar("test".toCharArray(), 4));
    }
}