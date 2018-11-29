package com.programcreek.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bbabic on 9/17/17.
 */
public class LargestNumberTest {
  LargestNumber ln = new LargestNumber();

  @Test public void testGet() throws Exception {
    String[] array = {"3", "30", "34", "5", "9"};
    assertEquals("9534330", ln.get(array));
  }
}