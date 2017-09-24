package com.interview.doordash.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bojan on 2/22/17.
 */
public class OverlapTimesTest {
    OverlapTimes ol = new OverlapTimes();
    @Test
    public void findOverlaps() throws Exception {

        WorkingHours w11 = new WorkingHours(7,8);
        WorkingHours w12 = new WorkingHours(12,14);
        WorkingHours w13 = new WorkingHours(15,17);
        WorkingHours w21 = new WorkingHours(6,9);
        WorkingHours w22 = new WorkingHours(13,15);
        WorkingHours w23 = new WorkingHours(22,23);

        List<WorkingHours> s1 = new ArrayList<WorkingHours>();
        s1.add(w11);
        s1.add(w12);
        s1.add(w13);
        List<WorkingHours> s2 = new ArrayList<WorkingHours>();
        s2.add(w21);
        s2.add(w22);
        s2.add(w23);

        List<WorkingHours> o = ol.findOverlaps(s1, s2);
        System.out.println(o.toString());
    }

}