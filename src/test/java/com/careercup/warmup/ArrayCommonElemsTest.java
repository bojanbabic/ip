package com.careercup.warmup;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ArrayCommonElemsTest {

    ArrayCommonElems ace = new ArrayCommonElems();

    @Test
    public void findCommon() {
        int[] a11 = {1,2,3,4,5};
        int[] a12 = {1,2,3,4,5};
        int[] e1 = {1,2,3,4,5};
        assertArrayEquals(Arrays.stream(e1).boxed().collect(Collectors.toList()).toArray(), ace.findCommon(a11, a12).toArray());
        int[] a21 = {2,3,4,5};
        int[] a22 = {1,2,3,4,5};
        int[] e2 = {2,3,4,5};
        assertArrayEquals(Arrays.stream(e2).boxed().collect(Collectors.toList()).toArray(), ace.findCommon(a21, a22).toArray());
        int[] a31 = {1,2,3,4,5};
        int[] a32 = {2,3,4,5};
        int[] e3 = {2,3,4,5};
        assertArrayEquals(Arrays.stream(e3).boxed().collect(Collectors.toList()).toArray(), ace.findCommon(a31, a32).toArray());
        int[] a41 = {1,2,3,4,5};
        int[] a42 = {5,6,7,8,9};
        int[] e4 = {5};
        assertArrayEquals(Arrays.stream(e4).boxed().collect(Collectors.toList()).toArray(), ace.findCommon(a41, a42).toArray());
        int[] a51 = {1,2,3,4,5};
        int[] a52 = {6,7,8,9};
        int[] e5 = {};
        assertArrayEquals(Arrays.stream(e5).boxed().collect(Collectors.toList()).toArray(), ace.findCommon(a51, a52).toArray());
        int[] a61 = {1, 12, 15, 19, 20, 21};
        int[] a62 = {2, 15, 17, 19, 21, 25, 27};
        int[] e6 = {15, 19, 21};
        assertArrayEquals(Arrays.stream(e6).boxed().collect(Collectors.toList()).toArray(), ace.findCommon(a61, a62).toArray());
    }
}