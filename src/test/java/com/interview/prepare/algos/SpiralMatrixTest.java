package com.interview.prepare.algos;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpiralMatrixTest {

    @Test
    public void printSpiralMatrix() {
        int[][] sm = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        assertEquals("123698745", spiralMatrix.printSpiralMatrix(sm));

        int[][] sm1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        assertEquals("123481211109567", spiralMatrix.printSpiralMatrix(sm1));
    }
}