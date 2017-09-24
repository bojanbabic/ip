package com.interview.prepare.algos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bojan on 2/24/17.
 */
public class GameOfMind {
    static class Result {
        int hits;
        int pseudo;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Result result = (Result) o;

            if (hits != result.hits) return false;
            return pseudo == result.pseudo;

        }

        @Override
        public int hashCode() {
            int result = hits;
            result = 31 * result + pseudo;
            return result;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "hits=" + hits +
                    ", pseudo=" + pseudo +
                    '}';
        }
    }

//    public Result estimate(String guess, String solution) {
//        Result r = new Result();
//        for (int i = 0; i < 4; i++) {
//            guess.charAt(i) - 'A'
//        }
//        for (int i = 0; i < 4; i++) {
//        }
//        return r;
//    }


    public Result estimate(String guess, String solution) {
        Result r = new Result();
        int solutionMask = 0;
        Arrays.asList(solution.split(" "));
        // gather all solutions that exist (like a map)
        for (int i = 0; i < 4; i++) {
            solutionMask |= 1 << (solution.charAt(i) - 'A');
        }
        for (int i = 0; i < 4; i++) {
            if (guess.charAt(i) == solution.charAt(i)) {
                ++r.hits;
            } else if ((solutionMask & (1 << guess.charAt(i) - 'A')) > 1) {
                ++r.pseudo;
            }
        }
        return r;
    }
}
