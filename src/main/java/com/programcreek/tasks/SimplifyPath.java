package com.programcreek.tasks;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bbabic on 9/17/17.
 */
public class SimplifyPath {
  public static final String PARENT = "..";
  public static final String CURRENT = ".";
  public String simplify(String path) {
    String[] elems = path.split("/");
    List<String> updatedElems = Lists.newArrayList();
    int index = 0;
    for (String e: elems) {
      if (e.isEmpty() || index == 0 && e.equals(PARENT)) {
        continue;
      }
      if (e.equals(PARENT)) {
        index = index - 1;
        updatedElems.remove(index);
        continue;
      }
      if (!e.equals(CURRENT)) {
        updatedElems.add(index, e);
        index = index + 1;
      }
    }
    return "/" + Joiner.on("/").join(updatedElems);
  }
}
