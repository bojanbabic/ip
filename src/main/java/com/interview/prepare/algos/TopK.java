package com.interview.prepare.algos;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TopK {
    public Integer sortTopK(int[] array, int k) {
        Arrays.sort(array);
        return array[array.length - 1 - k];
    }

    /**
     * N * Log(K) - size of the tree
     * @param array
     * @param k
     * @return
     */
    public Integer heapTopK(int[] array, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < array.length; i++) {
            pq.offer(array[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public Integer quickSortTopK(int[] array, int k) {
        return findK(array, array.length - k - 1, 0, k);
    }

    private Integer findK(int[] array, int k, int start, int end) {
        int pivot = array[end];
        int i = start;
        int j = end;
        while (true) {
            while (array[i] < pivot && i < j) {
                i++;
            }
            while (array[j] >= pivot && j > i) {
                j--;
            }

            swap(array, i, j);

            if (i == j) {
                break;
            }
        }

        if (k == i + 1) {
            return pivot;
        } else if (k < pivot) {
            return findK(array, k, start, pivot);
        } else {
            return findK(array, k, pivot + 1, end);
        }

    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
