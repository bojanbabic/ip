package com.programcreek.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bbabic on 9/17/17.
 */
public class SimplifyPathTest {
  SimplifyPath sp = new SimplifyPath();

  @Test public void testSimplify() throws Exception {
    String path1 = "/home/";
    assertEquals("/home", sp.simplify(path1));
    String path2 = "/a/./b/../../c/";
    assertEquals("/c", sp.simplify(path2));
    String path3 = "/../";
    assertEquals("/", sp.simplify(path3));
    String path4 = "/home//foo/";
    assertEquals("/home/foo", sp.simplify(path4));
    String path5 = "./a/b/c/../../d";
    assertEquals("/a/d", sp.simplify(path5));
  }
}