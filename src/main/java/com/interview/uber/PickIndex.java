package com.interview.uber;

import java.util.Random;
import java.util.stream.IntStream;

class PickIndex {
    float[] weights;
    Random rand;

    public PickIndex(int[] w) {
        this.rand = new Random();
        int sum = IntStream.of(w).sum();
        this.weights = new float[w.length];
        float cum = 0.0f;
        for (int i = 0; i < w.length; i++) {
            this.weights[i] = cum + w[i] / (float) sum;
            cum += w[i] / sum;
        }
        toString();
    }

    public int pickIndex() {
        float r = rand.nextFloat();
        float p = 0;
        int idx = -1;
        for (int i = 0; i < this.weights.length; i++) {
            float c = this.weights[i];
            if (r >= p && r < c) {
                idx = i;
            }
            p = c;
        }
        return idx;
    }
}



