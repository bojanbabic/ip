package com.interview.prepare.algos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 4/4/17.
 * https://leetcode.com/problems/edit-distance/#/solutions
 * https://www.youtube.com/watch?v=z_CB7Gih_Mg
 */
public class EditDistanceTest {
    EditDistance ed = new EditDistance();
    @Test
    public void calculate() throws Exception {
        ed.calculate("aba", "mama");
    }

    @Test
    public void editDistanceRecursive() {
        Assert.assertEquals(3, ed.editDistanceRecursive("saturday".toCharArray(), "sunday".toCharArray(), 0, 0));
    }

}