package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 4/12/17.
 */
public class BacktrackingTest {
    Backtracking b = new Backtracking();

    @Test
    public void subsets() throws Exception {
        int[] nums = {1, 2, 3};
//        b.subsets(nums);
        b.permutations(nums);
    }

}