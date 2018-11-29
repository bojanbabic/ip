package com.interview.prepare.algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BullsCows {
    public String calculate(char[] target, char[] guess) {
        int i = 0;
        int bullCnt = 0;
        int cowCnt = 0;
        Map<Character, List<Integer>> usedBulls = new HashMap<Character, List<Integer>>();
        Map<Character, List<Integer>> usedCows = new HashMap<Character, List<Integer>>();
        while (i < guess.length) {
            if (target[i] == guess[i]) {
                usedBulls.computeIfAbsent(guess[i], k -> new ArrayList<Integer>()).add(i);
                bullCnt++;
            } else {
                for (int j = 0; j < target.length; j++) {
                    if (j != i && target[j] == guess[i]
                            &&!usedCows.getOrDefault(guess[i], new ArrayList<Integer>()).contains(j)
                            &&!usedBulls.getOrDefault(guess[i], new ArrayList<Integer>()).contains(j)) {
                        usedCows.computeIfAbsent(guess[i], k -> new ArrayList<Integer>()).add(j);
                        cowCnt++;
                        break;
                    }
                }
            }
            i++;
        }
        return bullCnt + "A" + cowCnt + "B";
    }
}
