package com.interview.cruise.prepare;

import com.google.common.io.Resources;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class WordCountTest {

    @Test
    public void cnt() throws IOException {
        List<String> lines = Files.lines(
                Paths.get(
                        Resources.getResource("wordCount.txt").getPath())
        ).collect(Collectors.toList());
        assertEquals(new Long(1), new WordCount().cnt(lines).get("banana"));
        assertEquals(new Long(2), new WordCount().cnt(lines).get("kitty"));
    }
}