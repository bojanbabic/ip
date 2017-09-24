package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 2/24/17.
 */
public class GameOfMindTest {
    GameOfMind gm = new GameOfMind();
    @Test
    public void estimate() throws Exception {
        GameOfMind.Result r = new GameOfMind.Result();
        r.hits = 2;
        r.pseudo = 1;
        assertEquals(r, gm.estimate("YRGB", "RGGB"));
    }
}