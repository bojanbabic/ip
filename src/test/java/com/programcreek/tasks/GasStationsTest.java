package com.programcreek.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bbabic on 9/17/17.
 */
public class GasStationsTest {
  GasStations gs = new GasStations();

  @Test public void testCanCircle() throws Exception {
    Integer[] gas = {1, 2, 3, 4, 5};
    Integer[] cost = {1, 3, 2, 4, 5};
    assertTrue(gs.canCircle(gas, cost, 5));
  }
}