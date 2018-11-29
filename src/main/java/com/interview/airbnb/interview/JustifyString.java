package com.interview.airbnb.interview;

import java.util.Arrays;
import java.util.List;

/**
 * TODO check for another solution
 * https://discuss.leetcode.com/category/76/text-justification
 * Created by bojan on 3/10/17.
 */
public class JustifyString {
    public void doJustify(String text, Integer width) {
        List<String> wordList = Arrays.asList(text.split(" "));
        int tmpCnt = 0;
        int tmpIndex = 0;
        for (int i = 0; i < wordList.size(); i++) {
            if (tmpCnt + wordList.get(i).length() <= width) {
                // TODO tmpCnt = 49
                tmpCnt += wordList.get(i).length() + 1;
                if (i == wordList.size() - 1) {
                    String out = "";
                    for (int k = tmpIndex; k <= i; k++) {
                        out += wordList.get(k) + " ";
                    }
                    System.out.println(out);
                }
            } else {
                String out = "";
                int diff = Math.abs(tmpCnt - width);
                int base = diff / (i - 1 - tmpIndex);
                int reminder = diff % (i - 1 - tmpIndex);
                for (int k =  tmpIndex; k <= i - 1; k++) {
                    out += wordList.get(k);
                    int tmpBase = base;
                    while (tmpBase-- > 0) {
                        out += " ";
                    }
                    if (reminder > 0) {
                        out = out + " ";
                        reminder--;
                    }
                }
                System.out.println(out);
                tmpIndex = i;
                i = i - 1;
                tmpCnt = 0;
            }

        }
    }
}
