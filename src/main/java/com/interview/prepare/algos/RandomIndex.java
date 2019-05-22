package com.interview.prepare.algos;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class RandomIndex {
    int[] w;
    double[] pmf;
    private void cumulativeProbs() {
        int sum = IntStream.of(w).sum();
        IntStream.of(0, w.length).forEach(i -> {
            double partial = w[i] / sum;
            pmf[i] = partial + DoubleStream.of(pmf).sum();
        });


    }
    public RandomIndex(int[] w) {
        this.w = w;
        this.pmf = new double[w.length];
        cumulativeProbs();
    }

    public int pickIndex() {
        double r = Math.random();
        for (int i = 0; i < pmf.length; i++) {
            if (pmf[i] < r && r < pmf[i + 1]) {
                return i;
            }
        }
        return pmf.length - 1;
    }
}
