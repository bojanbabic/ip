package com.interview.prepare.algos;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RestoreIPTest {

    @Test
    public void restore() {
       RestoreIP rIP = new RestoreIP();
       List<String> expected  = Arrays.asList("255.255.11.135", "255.255.111.35");
       Assert.assertEquals(expected, rIP.restore("25525511135"));
    }
}