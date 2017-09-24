package com.interview.prepare.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/31/17.
 */
public class LetterCombinationsTest {
    LetterCombinations lc = new LetterCombinations();
    @Test
    public void letterCombinations() throws Exception {
        String[] s = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        List<String> list = new ArrayList<String>(Arrays.asList(s));
//        assertEquals(list, lc.letterCombinations("23"));
        assertEquals(list, lc.letterCombinations("2"));
    }

}