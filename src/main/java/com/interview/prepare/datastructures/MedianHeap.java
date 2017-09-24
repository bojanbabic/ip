package com.interview.prepare.datastructures;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * http://www.geeksforgeeks.org/median-of-stream-of-integers-running-integers/
 * Created by bojan on 2/26/17.
 */
public class MedianHeap {

    int N = 100;
    // min heap contains elements greater then median
    public PriorityQueue<Integer> minHeap;
    // max heap contains elements less then median
    public PriorityQueue<Integer> maxHeap;

    public void reset() {
        minHeap = new PriorityQueue<Integer>(N);
        maxHeap = new PriorityQueue<Integer>(N, Collections.<Integer>reverseOrder());
    }

    public void addElement(int num) {
        if (maxHeap.isEmpty()) {
            maxHeap.add(num);
        }
        else if (maxHeap.size() == minHeap.size()) {
            if (num > maxHeap.peek()) {
                minHeap.add(num);
                maxHeap.add(minHeap.remove());
            }
            else {
                maxHeap.add(num);
            }
        }
        else if (maxHeap.size() > minHeap.size()) {
            if (num > maxHeap.peek()) {
                minHeap.add(num);
            }
            else {
                maxHeap.add(num);
                minHeap.add(maxHeap.remove());
            }
        }
        // Note: maxHeap will never be smaller size than minHeap
    }

    public double getMedian() {
        // problem statement said: will always have at least 1 element
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }
        else { // same size
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
}

