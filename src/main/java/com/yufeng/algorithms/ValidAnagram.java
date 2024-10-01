package com.yufeng.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            String tmp = String.valueOf(t.charAt(i));
            if (!s.contains(tmp)) {
                return false;
            }
            s = s.replaceFirst(tmp, "");
        }

        if (s.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sort(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1, t1);
    }

    public boolean hashmap(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (char tmp : s.toCharArray()) {
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }

        for (char tmp : t.toCharArray()) {
            map.put(tmp, map.getOrDefault(tmp, 0) - 1);
        }

        for (int i : map.values()) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public boolean intArray(String s, String t) {
        int[] intArr = new int[26];

        for (char tmp : s.toCharArray()) {
            intArr[tmp - 'a']++;
        }

        for (char tmp : t.toCharArray()) {
            intArr[tmp - 'a']--;
        }

        for (int i : intArr) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
