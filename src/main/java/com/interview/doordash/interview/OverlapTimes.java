package com.interview.doordash.interview;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

/**
 * TODO see interval tree for better performing solution
 *
 * http://www.geeksforgeeks.org/given-n-appointments-find-conflicting-appointments/
 * interval tree:
 *  - intervals ordered by interval low values (self balanced binary tree)
 *  - node keep info on low, high values of interval as well as max value of the subtree
 *
 */
public class OverlapTimes {

    public List<WorkingHours> findOverlaps(List<WorkingHours> s1, List<WorkingHours> s2) {
        List<WorkingHours> overlapTimes = new ArrayList<WorkingHours>();
        for (WorkingHours w1: s1) {
            for (WorkingHours w2: s2) {
                if (w1.to < w2.from) {
                    break;
                }
                if (w2.from >= w1.to || w2.to <= w1.from) {
                    continue;
                } else {
                    overlapTimes.add(new WorkingHours(max(w1.from, w2.from), min(w1.to, w2.to)));
                }
            }
        }
        return overlapTimes;
    }

}
