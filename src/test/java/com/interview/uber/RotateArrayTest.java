package com.interview.uber;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RotateArrayTest {

    @Test
    public void rotate() {
        int[] nums = {1,2,3,4,5,6,7};
        int[] expected = {4,5,6,7,1,2,3};

        RotateArray ra = new RotateArray();
        ra.rotate(nums, 3);
        Assert.assertArrayEquals(Arrays.asList(expected).toArray(), Arrays.asList(nums).toArray());

    }
}