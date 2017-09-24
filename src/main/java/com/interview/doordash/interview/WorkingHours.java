package com.interview.doordash.interview;

/**
 * Created by bojan on 2/22/17.
 */
public class WorkingHours {
    int from;
    int to;

    public WorkingHours(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "WorkingHours{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}

