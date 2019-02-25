package com.careercup.warmup;

import java.util.ArrayList;
import java.util.List;

public class ArrayCommonElems {
    public List<Integer> findCommon(int[] a1, int[] a2) {
        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                i++;
            } else if (a1[i] > a2[j]) {
                j++;
            } else {
                result.add(a1[i]);
                i++; j++;
            }
        }
        return result;
    }
}
