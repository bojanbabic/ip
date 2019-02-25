package com.interview.prepare.algos;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ExamRoom {
//
//    class Interval {
//        int x, y, dist;
//        public Interval(int x, int y) {
//            this.x = x;
//            this.y = y;
//            if (x == -1) {
//                this.dist = y;
//            } else if (y == N){
//                this.dist = N - 1 - x;
//            } else {
//                this.dist = Math.abs(x - y) / 2;
//            }
//        }
//    }
//
//    private PriorityQueue<Interval> seats;
//    private int occupied = 0;
//    private int N;
//
//    public ExamRoom(int N) {
//        this.seats = new PriorityQueue<>((a, b) -> a.dist != b.dist ? b.dist - a.dist : a.x - b.x);
//        this.N = N;
//        seats.add(new Interval(-1, N));
//    }
//
//    public int seat() {
//        if (occupied == 0) {
//            seats[0] = 1;
//            occupied++;
//            return 0;
//        }
//        int[] gaps = new int[occupied+1];
//        int tmp = 0;
//        int i = 0, k = 0;
//        while (i < seats.length) {
//            while (i < seats.length && seats[i] == 0) {
//                if (i == seats.length - 1) {
//                    gaps[k] = i;
//                    break;
//                }
//                i++;
//            }
//            gaps[k++] = i++;
//        }
//        int maxGap = Integer.MIN_VALUE;
//        int maxMid = Integer.MAX_VALUE;
//        for (int o = 1; o < gaps.length; o++) {
//            if (gaps[o] - gaps[o-1] > maxGap) {
//                maxGap = gaps[o] - gaps[o - 1];
//                if (seats[gaps[o]] == 0) {
//                    maxMid = gaps[o];
//                } else {
//                    maxMid = (gaps[o] + gaps[o - 1]) / 2;
//                }
//            }
//        }
//        seats[maxMid] = 1;
//        occupied++;
//        return maxMid;
//    }
//
//    public void leave(int p) {
//        seats[p] = 0;
//        occupied--;
//    }
}