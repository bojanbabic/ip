package com.interview.prepare.algos;

import org.junit.Test;

/**
 * Created by bojan on 4/12/17.
 */
public class PermutationsTest {
    Backtracking p = new Backtracking();
    @Test
    public void permute() throws Exception {
        int[] i = {1,2,3};
        p.subsets(i);
    }

}