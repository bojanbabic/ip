package com.interview.uber;

import org.junit.Test;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    @Test
    public void groupAnagrams() {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        ga.groupAnagrams(strings);
    }
}