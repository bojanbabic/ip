package com.interview.uber;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ExclusiveTimeOfFunctionsTest {

    @Test
    public void exclusiveTime() {
        ExclusiveTimeOfFunctions e = new ExclusiveTimeOfFunctions();
        String[] logs = {
                "0:start:0",
                "1:start:2",
                "1:end:5",
                "0:end:6"
        };

        int[] expected = {3, 4};

//        assertArrayEquals(expected, e.exclusiveTime(2, Arrays.stream(logs).collect(Collectors.toList())));

        String[] logs1 = {
                "0:start:0",
                "0:end:0",
                "1:start:1",
                "1:end:1",
                "2:start:2",
                "2:end:2",
                "2:start:3",
                "2:end:3"
        };

        int[] expected1 = {1, 1, 2};
        assertArrayEquals(expected1, e.exclusiveTime(3, Arrays.stream(logs1).collect(Collectors.toList())));
    }
}