package com.programcreek.tasks;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by bbabic on 9/20/17.
 */
public class CandiesTest {
  Candies candies = new Candies();

  @Test public void testMinCandies() throws Exception {
    assertArrayEquals(new int[]{1,2,3}, candies.minCandies(new int[]{1,2,3}));
//    assertEquals(Arrays.toString(new int[]{1, 2, 1, 1, 1, 1}), Arrays.toString(candies.minCandies(new int[]{1, 4, 3, 3, 3, 1})));
    // with fix
    assertEquals(Arrays.toString(new int[]{1, 3, 2, 2, 2, 1}), Arrays.toString(candies.minCandies(new int[]{1, 4, 3, 3, 3, 1})));
//    assertEquals(Arrays.toString(new int[]{1, 1, 2, 1, 1, 1}), Arrays.toString(candies.minCandies(new int[]{1, 1, 4, 3, 2, 2})));
    // with fix
    assertEquals(Arrays.toString(new int[]{1, 1, 3, 2, 1, 1}), Arrays.toString(candies.minCandies(new int[]{1, 1, 4, 3, 2, 2})));
//    assertEquals(Arrays.toString(new int[]{1, 1, 2, 1, 1, 1}), Arrays.toString(candies.minCandies(new int[]{1, 1, 4, 3, 2, 2})));
    // with fix
    assertEquals(Arrays.toString(new int[]{1, 1, 3, 2, 1, 1}), Arrays.toString(candies.minCandies(new int[]{1, 1, 4, 3, 2, 2})));
    assertEquals(Arrays.toString(new int[]{1, 2, 1, 2, 1, 1}), Arrays.toString(candies.minCandies(new int[]{2, 3, 1, 3, 1, 1})));
    assertEquals(Arrays.toString(new int[]{1, 2, 1, 1, 2, 3, 4, 3, 2, 1, 2, 1}),
        Arrays.toString(candies.minCandies(new int[]{5, 6, 2, 2, 4, 8, 9, 5, 4, 0, 5, 1})));
  }
}