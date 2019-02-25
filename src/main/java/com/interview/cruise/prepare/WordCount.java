package com.interview.cruise.prepare;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://www.glassdoor.com/Interview/1-Without-using-hashmap-do-word-count-on-file-2-Do-wordcount-in-more-detail-3-Design-linkedin-like-job-search-4-So-QTN_2405235.htm
 */
public class WordCount {
    // no hashmap
    public Map<String, Long> cnt(List<String> lines) throws IOException {
        Map<String, Long> map = lines.stream()
                .flatMap(l -> Arrays.stream(l.split("\\s")))
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        return map;
    }
}
