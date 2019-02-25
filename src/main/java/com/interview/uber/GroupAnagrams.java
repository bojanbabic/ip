package com.interview.uber;

import com.google.common.collect.Maps;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            groups.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
        }
        return groups.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
    }
}
