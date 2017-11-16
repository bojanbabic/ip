package com.interview.prepare.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/8/17.
 */
public class CombinationSumTest {
    CombinationSum cs = new CombinationSum();
    @Test
    public void combinationSum() throws Exception {
        int[] a = { 2, 3, 6, 7 };
        assertEquals(2, cs.combinationSum(a, 7).size());
        int[] a1 = { 8, 7, 4, 3 };
        assertEquals(3, cs.combinationSum(a1, 11).size());
        int[] a2 = { 8, 7, 2, 3 };
        assertEquals(1, cs.combinationSum(a2, 5).size());
    }

    @Test
    public void combinationSumBacktracking() throws Exception {
        Integer[] a = { 2, 3, 6, 7 };
        assertEquals(2, cs.combinationSumBacktracking(new ArrayList<Integer>(Arrays.asList(a)), 7).size());
    }

}