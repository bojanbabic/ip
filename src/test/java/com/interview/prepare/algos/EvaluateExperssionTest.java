package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 4/7/17.
 */
public class EvaluateExperssionTest {
    EvaluateExperssion ee = new EvaluateExperssion();
    @Test
    public void calculate() throws Exception {
        assertEquals(-4, ee.calculate("((0-2)+(3-5))"));
        assertEquals(0, ee.calculate("(2+(3-5))"));
        assertEquals(0, ee.calculate("(2+3-5)"));
        assertEquals(2, ee.calculate("(0-(3-5))"));
        assertEquals(8, ee.calculate("(0-((0-3)-5))"));
    }

}