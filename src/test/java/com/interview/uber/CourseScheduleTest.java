package com.interview.uber;

import org.junit.Test;

import static org.junit.Assert.*;

public class CourseScheduleTest {

    @Test
    public void canFinish() {
        CourseSchedule cs = new CourseSchedule();
        int[][] n1 = {
                {0, 1}
        };
        assertTrue(cs.canFinish(2, n1));

        int[][] n2 = {
                {0, 1},
                {1, 0}
        };
        assertFalse(cs.canFinish(2, n2));

        int[][] n3 = {
                {1, 0}
        };
        assertTrue(cs.canFinish(3, n3));

    }
}