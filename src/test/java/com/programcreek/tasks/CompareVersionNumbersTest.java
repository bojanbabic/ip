package com.programcreek.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bbabic on 9/17/17.
 */
public class CompareVersionNumbersTest {
  CompareVersionNumbers cn = new CompareVersionNumbers();

  @Test public void testCompare() throws Exception {
    assertEquals(-1, cn.compare("0.1", "1.1"));
    assertEquals(-1, cn.compare("0.1", "1.2"));
    assertEquals(-1, cn.compare("0.1", "13.37"));
    assertEquals(-1, cn.compare("1.1", "1.2"));
    assertEquals(-1, cn.compare("1.1", "13.37"));
    assertEquals(-1, cn.compare("1.2", "13.37"));
    assertEquals(1, cn.compare("13.37.1", "13.37"));
  }
}