package com.interview.prepare.math;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 2/17/17.
 */
public class NumberOperationsTest {
    private NumberOperations p = new NumberOperations();
    @Test
    public void isPrimeTest() throws Exception {
        assertTrue(p.isPrime(2));
        assertFalse(p.isPrime(1));
        assertTrue(p.isPrime(1931));
    }

    @Test
    public void getAllPrimesTest() {
        assertEquals(21, p.findAllPrimesEfficient(20).length);
    }

    @Test
    public void greatestCommonDivisorTest() {
        assertEquals(14, p.greatestCommonDivisor(28, 14));
        assertEquals(1, p.greatestCommonDivisor(28, 13));
    }

    @Test
    public void GCDTest() {
        assertEquals(14, p.GCD(28, 14));
        assertEquals(1, p.GCD(28, 13));
        assertEquals(146, p.GCD(2336, 1314));
    }

    @Test
    public void toDecimalTest() {
        assertEquals(5, p.toDecimal("101", 2));
        assertEquals(11, p.toDecimal("1011", 2));
    }

    @Test
    public void toBinaryTest() {
        assertEquals("1111", p.fromDecimal(15, 2));
        assertEquals("101011", p.fromDecimal(43, 2));
        assertEquals("F", p.fromDecimal(15, 16));
        assertEquals("10", p.fromDecimal(16, 16));
        assertEquals("1F", p.fromDecimal(31, 16));
    }

}