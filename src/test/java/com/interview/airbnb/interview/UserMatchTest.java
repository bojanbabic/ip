package com.interview.airbnb.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by bojan on 3/9/17.
 */
public class UserMatchTest {
    UserMatch um = new UserMatch();
    @Test
    public void findMatches() throws Exception {
        List<String> data = new ArrayList<String>();
        data.add("U1,Amsterdam,Barcelona,London,Prague");
        data.add("U2,Shanghai,Hong Kong,Moscow,Sydney,Melbourne");
        data.add("U3,London,Boston,Amsterdam,Madrid");
        data.add("U4,Barcelona,Prague,London,Sydney,Moscow");
        um.readData(data);
        List<String> cities = new ArrayList<String>();
        cities.add("Amsterdam");
        cities.add("Barcelona");
        cities.add("London");
        cities.add("Prague");
        List<String> res = um.findMatches(cities);
        System.out.println(res);
        assertEquals(3, res.size());
    }

}