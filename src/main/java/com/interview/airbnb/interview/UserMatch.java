package com.interview.airbnb.interview;

import java.util.*;

/**
 * Created by bojan on 3/9/17.
 */
public class UserMatch {

    HashMap<String, List<String>> userCityMap = new HashMap<String, List<String>>();
    HashMap<String, List<String>> cityUserMap = new HashMap<String, List<String>>();

    public void readData(List<String> userData) {
        for (String userD: userData) {
            List<String> userDataList = Arrays.asList(userD.split(","));
            String user = userDataList.get(0);
            List<String> cities = userDataList.subList(1, userDataList.size());
            userCityMap.put(user, cities);

            for (String city: cities) {
                List<String> users = new ArrayList<String>();
                if (cityUserMap.containsKey(city)) {
                    users = cityUserMap.get(city);
                }
                users.add(user);
                cityUserMap.put(city, users);
            }
        }
    }

    public List<String> findMatches(List<String> cityData) {
        int threshold = cityData.size() / 2;
        List<String> matches = new ArrayList<String>();
        HashMap<String, Integer> matchesMap = new HashMap<String, Integer>();
        for (String city: cityData) {
            List<String> userMatch = cityUserMap.get(city);
            for (String user: userMatch) {
                if (matchesMap.containsKey(user)) {
                    Integer cnt = matchesMap.get(user);
                    matchesMap.put(user, cnt + 1);
                } else {
                    matchesMap.put(user,1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String , Integer>>( matchesMap.entrySet() );
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> kvEntry, Map.Entry<String, Integer> t1) {
                return t1.getValue() - kvEntry.getValue();
            }
        });
        
        for (Map.Entry<String, Integer> k: list) {
            if (k.getValue() >= threshold) {
                matches.add(k.getKey());
            }
        }
        return matches;
    }

}
