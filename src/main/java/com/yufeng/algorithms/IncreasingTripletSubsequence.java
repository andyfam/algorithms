package com.yufeng.algorithms;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return false;
        }

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            if (nums[i] <= a) {
                a = nums[i];
            } else if (nums[i] <= b) {
                b = nums[i];
            } else {
                return true;
            }
        }

        return false;
    }
}
