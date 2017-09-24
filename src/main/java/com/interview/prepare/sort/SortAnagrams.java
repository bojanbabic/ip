package com.interview.prepare.sort;

import java.util.*;

/**
 * Created by bojan on 2/21/17.
 */
public class SortAnagrams implements Comparator<String> {

    public Map<String, List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> groups = new HashMap<String, List<String>>();
        for (String s: strings) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = c.toString();
            if (groups.containsKey(sorted)) {
                groups.get(sorted).add(s);
            } else {
                List<String> l = new ArrayList<String>();
                l.add(s);
                groups.put(sorted, l);
            }
        }
        return groups;
    }

    private String sortString(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return c.toString();
    }

    public int compare(String s, String t1) {
        return sortString(s).compareTo(sortString(t1));
    }
}
