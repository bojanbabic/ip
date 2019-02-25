package com.interview.uber;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GenerateParenthesesTest {

    @Test
    public void generateParenthesis() {
        GenerateParentheses gp = new GenerateParentheses();
//        assertTrue(gp.isValid("(())"));
//        assertTrue(gp.isValid("()(())"));
//        assertTrue(gp.isValid("(())()"));

        List<String> expected = Lists.newArrayList();
        expected.add("((()))");
        expected.add("(()())");
        expected.add("(())()");
        expected.add("()(())");
        expected.add("()()()");
        assertArrayEquals(expected.toArray(), gp.generateParenthesis(3).toArray());
    }
}