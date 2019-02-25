package com.interview.lyft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> rest = Arrays.stream(asteroids).boxed().collect(Collectors.toList());
        boolean isCollision = true;
        while (isCollision) {
            List<Integer> tmp = new ArrayList<>();
            if (rest.size() < 2) {
                return rest.stream().mapToInt(i -> i).toArray();
            }
            for (int i = 0; i < rest.size() - 1; ) {
                int cur = rest.get(i);
                int next = rest.get(i + 1);
                if (Math.signum(cur) == Math.signum(next)) {
                    tmp.add(cur);
                    tmp.add(next);
                    isCollision = false;
                    i++;
                } else {
                    if (Math.abs(cur) != Math.abs(next)) {
                        int winner = Math.abs(cur) > Math.abs(next) ? cur : next;
//                        if (tmp.isEmpty() || tmp.get(tmp.size() - 1) != winner) {
//                            tmp.add(winner);
//                        }
                        if (tmp.size() == 0) {
                            tmp.add(winner);

                        } else {
                            tmp.set(tmp.size() - 1, winner);
                        }
                    }
                    i = i + 2;
                    isCollision = true;
                }
            }
            rest = tmp;
        }
        return rest.stream().mapToInt(i -> i).toArray();
    }

    public int[] asteroidCollisionStack(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        stack.push(asteroids[0]);
        for (int i = 1; i < asteroids.length; i++) {
            int curr = asteroids[i];
            if (stack.isEmpty()) {
                stack.push(curr);
                continue;
            }
            if (Math.signum(stack.peek()) == Math.signum(asteroids[i])) {
                stack.push(asteroids[i]);
            } else {
                if (Math.signum(stack.peek()) < 0 && Math.signum(asteroids[i]) > 0) {
                    stack.push(asteroids[i]);
                } else {
                    while (!stack.isEmpty() && Math.signum(stack.peek()) > 0 && Math.signum(curr) < 0) {
                        int top = stack.pop();
                        if (top == Math.abs(curr)) {
                            curr = 0;
                            break;
                        }
                        int winner = top > Math.abs(asteroids[i]) ? top : curr;
                        curr = winner;
                    }
                    if (curr != 0) {
                        stack.push(curr);
                    }
                }
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}
