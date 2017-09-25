package com.programcreek.tasks;

/**
 * Created by bbabic on 9/17/17.
 */
public class GasStations {
  public boolean canCircle(Integer[] gas, Integer[] cost, int n) {
    int total = 0;
    for (int i = 0; i < n; i++) {
      int remaining = gas[i] - cost[i];
      total += remaining;
      if (total < 0) {
        return false;
      }
    }
    return true;
  }
}
