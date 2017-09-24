package com.interview.prepare.math;

import com.interview.prepare.string.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bojan on 2/19/17.
 */
public class StringUtilTest {
    StringUtil sl = new StringUtil();
    @Test
    public void substringTest() throws Exception {
        assertTrue(sl.substring("abc", "c"));
        assertTrue(sl.substring("abcc", "bcc"));
        assertTrue(sl.substring("abc", ""));
        assertFalse(sl.substring("abc", "f"));
    }

}