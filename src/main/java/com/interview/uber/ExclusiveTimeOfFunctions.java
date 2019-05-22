package com.interview.uber;

import java.util.*;

public class ExclusiveTimeOfFunctions {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] runningTimes = new int[n];
        Stack<Integer> stack = new Stack<>();
        int currentTime = 0;
        for (int i = 0; i < logs.size(); i++) {
            String l = logs.get(i);
            String[] tokens = l.split(":");
            Integer worker = Integer.parseInt(tokens[0]);
            Integer time = Integer.parseInt(tokens[2]);
            Integer current;
            if (stack.isEmpty() && tokens[1].equals("start")) {
                stack.push(worker);
                continue;
            }
            if (tokens[1].equals("start")) {
                current = stack.peek();
                stack.push(worker);
            } else if (tokens[1].equals("end")) {
                current = stack.pop();
                if (current == worker) {
                    time = time + 1;
                }
            } else {
                throw new IllegalArgumentException("Unknown state");
            }
            runningTimes[current] = runningTimes[current] + time - currentTime;
            currentTime = time;
        }
        return runningTimes;
    }
}
