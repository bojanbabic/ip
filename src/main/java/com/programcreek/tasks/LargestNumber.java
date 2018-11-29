package com.programcreek.tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by bbabic on 9/17/17.
 */
public class LargestNumber {
  public String get(String[] array) {
    StringBuilder sb = new StringBuilder();
//    Arrays.sort(array, Collections.reverseOrder());
    Arrays.sort(array, new Comparator<String>() {

      public int compare(final String o1, final String o2) {
        return (o2 + o1).compareTo(o1 + o2);
      }
    });
    for (String s: array) {
      sb.append(s);
    }
    return sb.toString();
  }
}
