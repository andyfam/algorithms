package com.yufeng.algorithms;

public class FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {
        int max = 0;
        int tmp = 0;

        for (int i = 0; i < gain.length; i++) {
            tmp = tmp + gain[i];
            max = Math.max(max, tmp);
        }

        return max;
    }
}
