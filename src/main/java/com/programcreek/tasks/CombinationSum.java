package com.programcreek.tasks;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by bbabic on 9/23/17.
 */
public class CombinationSum {
  public void sum(int[] ints, ArrayList<Integer> elems, int target) {
    List<Integer> candidates = new ArrayList<Integer>();
    for (int i = 0; i < ints.length; i++) {
      candidates.add(ints[i]);
      if (ints[i] < target) {
        sum(ints, new ArrayList<Integer>(candidates), target - ints[i]);
      } else if (target == ints[i]) {

      }
    }
  }
}
