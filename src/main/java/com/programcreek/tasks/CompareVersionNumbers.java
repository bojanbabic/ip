package com.programcreek.tasks;

/**
 * Created by bbabic on 9/17/17.
 */
public class CompareVersionNumbers {
  public int compare(String version1, String version2) {
    String[] v1 = version1.split("\\.");
    String[] v2 = version2.split("\\.");
    for (int i = 0; i < Math.min(v1.length, v2.length); i++) {
      Integer currentV1 = Integer.parseInt(v1[i]);
      Integer currentV2 = Integer.parseInt(v2[i]);
      if (currentV1 == currentV2) {
        continue;
      }
      return currentV1 > currentV2 ? 1 : -1;
    }
    if (v1.length == v2.length) {
      return 0;
    }
    if (v1.length > v2.length) {
      return 1;
    } else {
      return 0;
    }
  }

}
