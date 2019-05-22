package com.interview.prepare.algos;

import java.util.ArrayList;
import java.util.List;

public class RestoreIP {
    public List<String> restore(String ip) {
        List<String> ips = new ArrayList<>();
        if (ip.length()  > 12) {
            return ips;
        }
        List<String> current = new ArrayList<>();
        restoreRecursive(ip, ips, current, 0);
        return ips;
    }

    private void restoreRecursive(String s, List<String> ips, List current, int idx) {
        if (idx > s.length()) {
            return;
        }
        if (current.size() == 4 && idx == s.length()) {
            ips.add(String.join(".", current));
            return;
        }

        for (int i = 1; i < 4; i++) {
            if (idx + i > s.length()) {
                break;
            }
            String part = s.substring(idx, idx + i);
            if ((part.startsWith("0") && part.length() > 1) || part.length() < 1 || Integer.parseInt(part) >= 256) {
                continue;
            }
            current.add(part);
            restoreRecursive(s, ips, new ArrayList(current), idx + i);
            current.remove(current.size() - 1);
        }
    }
}
