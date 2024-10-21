package com.yufeng.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DetermineIfTwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        if (arr1.length != arr2.length) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : arr1) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : arr2) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        int[] occurrences1 = new int[map1.size()];
        int i = 0;
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }
            occurrences1[i++] = entry.getValue();
        }


        int[] occurrences2 = new int[map2.size()];
        i = 0;
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            if (!map1.containsKey(entry.getKey())) {
                return false;
            }
            occurrences2[i++] = entry.getValue();
        }

        Arrays.sort(occurrences1);
        Arrays.sort(occurrences2);

        for (int j = 0; j < occurrences1.length; j++) {
            if (occurrences1[j] != occurrences2[j]) {
                return false;
            }
        }

        return true;
    }

    public boolean closeStrings2(String word1, String word2) {
        int[] occurrences1 = new int[26];
        int[] occurrences2 = new int[26];

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        if (arr1.length != arr2.length) {
            return false;
        }

        for (char c : arr1) {
            occurrences1[c - 'a']++;
        }

        for (char c : arr2) {
            occurrences2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((occurrences1[i] == 0 && occurrences2[i] != 0) || (occurrences2[i] == 0 && occurrences1[i] != 0)) {
                return false;
            }
        }

        Arrays.sort(occurrences1);
        Arrays.sort(occurrences2);

        for (int j = 0; j < occurrences1.length; j++) {
            if (occurrences1[j] != occurrences2[j]) {
                return false;
            }
        }

        return true;

    }
}
