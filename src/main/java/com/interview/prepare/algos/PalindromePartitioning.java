package com.interview.prepare.algos;

import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-partitioning/description/
 * Created by bbabic on 9/25/17.
 */
public class PalindromePartitioning {
  public List<String> palindromePartition(char[] word) {
    for (int i = 0; i < word.length; i++) {

    }
  return null;
  }

  private void palindromeBacktrack(List<String> list, char[] word) {
    if (isPalindrome(word)) {
      list.add(word.toString());
    } else {
      for (int i = 0; i < word.length; i++) {
        palindromeBacktrack(list, word);
      }
    }

  }


  private boolean isPalindrome(char[] word) {
    for (int i = 0; i < word.length/2; i++) {
      if (word[i] != word[word.length - 1- i]) {
        return false;
      }
    }
    return true;
  }
}
