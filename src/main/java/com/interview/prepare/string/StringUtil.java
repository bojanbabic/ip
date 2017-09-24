package com.interview.prepare.string;

/**
 * Created by bojan on 2/19/17.
 */
public class StringUtil {

    public boolean substring(String s1, String s2) {
        if (s2.length() == 0 || s1.charAt(0) == '\0' || s2.charAt(0) == '\0') {
            return true;
        }

        for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
            boolean isSub = true;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    isSub = false;
                    break;
                }
            }
            if (isSub) {
                return true;
            }
        }
        return false;
    }
}
