package com.interview.prepare.algos;

import java.util.*;

class WordLadder {
    public int ladderLengthOld(String beginWord, String endWord, List<String> wordList) {
        Integer ladderCount = 0;
        if (!wordList.contains(endWord)) {
            return ladderCount;
        }
        return ladderHelper(beginWord, endWord, wordList, ladderCount);
    }

    public int ladderHelper(String beginWord, String endWord,
                            List<String> wordList, int ladderCount) {
        if (wordList.size() == 0) {
            return ladderCount - 1;
        }
        String nextWord = wordList.get(0);
        int minTrans = Integer.MAX_VALUE;
        for (int j = 0; j < wordList.size(); j++) {
            String word = wordList.get(j);
            if (beginWord.equals(word)) {
                if (j == wordList.size() - 1) {
                    return 0;
                }
                nextWord = wordList.get(j + 1);
                break;
            }
            int transCount = 0;
            for (int i = 0; i < beginWord.length(); i++) {
                if (word.charAt(i) != beginWord.charAt(i)) {
                    transCount = transCount + 1;
                }
            }
            if (transCount < minTrans) {
                minTrans = transCount;
                nextWord = word;
            }
        }
        wordList.remove(beginWord);
        int offset = 1;

        if (minTrans == Integer.MAX_VALUE) {
            offset = 0;
        }
        return ladderHelper(nextWord, endWord, wordList, ladderCount + offset);
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int step = 1;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            while (queueSize-- > 0) {
                String w = queue.poll();
                for (int i = 0; i < w.length(); i++) {
                    for (char c = 'a'; c < 'z'; c++) {
                        StringBuilder nw = new StringBuilder(w);
                        nw.setCharAt(i, c);
                        if (wordList.contains(nw.toString())) {
                            if (endWord.equals(nw.toString())) {
                                return step + 1;
                            }
                            queue.offer(nw.toString());
                            wordList.remove(nw.toString());
                        }
                    }
                }
            }
            step = step + 1;
        }
        return 0;
    }
}
