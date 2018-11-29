package com.programcreek.tasks;

/**
 * Created by bbabic on 9/20/17.
 * https://discuss.leetcode.com/topic/37924/very-simple-java-solution-with-detail-explanation
 */
public class Candies {
  public int[] minCandies(int[] ratings) {
    int[] candies = new int[ratings.length];
    for (int i = 0; i < ratings.length; i++) {
      candies[i] = 1;
    }
    for (int i = 0; i < ratings.length - 1; i++) {
      if (ratings[i] < ratings[i+1]) {
        candies[i+1] = candies[i] + 1;
      }
    }

    for (int i = ratings.length - 1; i > 0; i--) {
      if (ratings[i - 1] > ratings[i] && candies[i - 1] <= candies[i]) {
        candies[i - 1] = candies[i] + 1;
      }
      // added fix to even out # of candies for kids with same ratings
      else if (ratings[i - 1] == ratings[i] && candies[i - 1] != candies[i]) {
        candies[i] =  Math.max(candies[i], candies[i-1]);
        candies[i-1] = candies[i];
      }
    }
    return candies;
  }
}
