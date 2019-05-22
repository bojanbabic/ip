package com.interview.uber;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpingGameTest {

    @Test
    public void canJump() {
        int[] nums = {2, 3, 1, 1, 4};
        JumpingGame jg = new JumpingGame();
        assertTrue(jg.canJump(nums));
//
        int[] nums1 = {1, 2};
        assertTrue(jg.canJump(nums1));

        int[] nums2 = {2, 0};
        assertTrue(jg.canJump(nums2));

//        int[] nums3 = {2, 5, 0, 0};
//        assertTrue(jg.canJump(nums3));

        int[] nums4 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        assertTrue(jg.canJump(nums4));

    }
}