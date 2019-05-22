package com.interview.uber;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict.size() == 0) {
            return true;
        }
        boolean foundMatch = false;
        for (String word: wordDict) {
            if (s.startsWith(word)) {
                s = s.substring(word.length());
                List newDict = new ArrayList(wordDict);
                newDict.remove(word);
                foundMatch = wordBreak(s, newDict);
            }
        }
        return foundMatch;
    }
}
