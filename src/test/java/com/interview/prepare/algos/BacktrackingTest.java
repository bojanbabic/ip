package com.interview.prepare.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by bojan on 4/12/17.
 */
public class BacktrackingTest {
    Backtracking b = new Backtracking();

    @Test
    public void testBacktracking() throws Exception {
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(new ArrayList<Integer>());
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1,2));
        expected.add(Arrays.asList(1,2,3));
        expected.add(Arrays.asList(1,3));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(2,3));
        expected.add(Arrays.asList(3));
        int[] nums = {1, 2, 3};
        assertArrayEquals(expected.toArray(), b.subsets(nums).toArray());
        List<List<Integer>> expectedPermutations = new ArrayList<List<Integer>>();
        expectedPermutations.add(Arrays.asList(1,2,3));
        expectedPermutations.add(Arrays.asList(1,3,2));
        expectedPermutations.add(Arrays.asList(2,1,3));
        expectedPermutations.add(Arrays.asList(2,3,1));
        expectedPermutations.add(Arrays.asList(3,1,2));
        expectedPermutations.add(Arrays.asList(3,2,1));
        assertArrayEquals(expectedPermutations.toArray(), b.permutations(nums).toArray());
    }
}