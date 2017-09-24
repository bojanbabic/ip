package com.interview.airbnb.interview;

import org.junit.Test;

/**
 * Created by bojan on 3/10/17.
 */
public class JustifyStringTest {
    JustifyString js = new JustifyString();
    @Test
    public void doJustify() throws Exception {
        js.doJustify("Ruby is a dynamic, open source programming language with a focus on simplicity and productivity. It has an elegant syntax that is natural to read and easy to write.\n", 50);

    }

}