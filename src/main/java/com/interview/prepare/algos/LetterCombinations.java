package com.interview.prepare.algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number
 * Created by bojan on 3/31/17.
 */
public class LetterCombinations {
    static final Map<Character, String> map;
    static {
        map = new HashMap<Character, String>();
        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits.length() == 0) {
            return res;
        }
        res.add("");
        for (char c: digits.toCharArray()) {
            String m = map.get(c);
            List<String> tmp = new ArrayList<String>();
            for (int i = 0; i < m.toCharArray().length; i++) {
                for (int j = 0; j < res.size(); j++) {
                    tmp.add(res.get(j) + m.charAt(i));
                }
            }
            res.addAll(tmp);
        }
        List<String> finalRes = new ArrayList<String>();
        for (String r: res) {
            if (r.length() == digits.length()) finalRes.add(r);
        }
        return finalRes;
    }
}
