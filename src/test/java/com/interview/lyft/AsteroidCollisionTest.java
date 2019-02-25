package com.interview.lyft;

import org.junit.Test;

import static org.junit.Assert.*;

public class AsteroidCollisionTest {

    @Test
    public void asteroidCollision() {
        AsteroidCollision ac = new AsteroidCollision();
        int[] a1 = {5, 10, -5};
        int[] expected1 = {5, 10};
        assertArrayEquals(expected1, ac.asteroidCollisionStack(a1));

        int[] a2 = {5, -5};
        int[] expected2 = {};
        assertArrayEquals(expected2, ac.asteroidCollisionStack(a2));

        int[] a3 = {10, 2, -5};
        int[] expected3 = {10};
        assertArrayEquals(expected3, ac.asteroidCollisionStack(a3));

        int[] a4 = {-2,-1,1,2};
        int[] expected4 = {-2, -1, 1, 2};
        assertArrayEquals(expected4, ac.asteroidCollisionStack(a4));

        int[] a5 = {1, -1, -2, -2};
        int[] expected5 = {-2, -2};
        assertArrayEquals(expected5, ac.asteroidCollisionStack(a5));
    }
}