package com.yufeng.algorithms;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int index = -1;

        int[] leftSums = new int[nums.length];
        leftSums[0] = 0;
        int[] rightSums = new int[nums.length];
        rightSums[nums.length - 1] = 0;

        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                leftSums[i] = leftSums[i - 1] + nums[i - 1];
            }

            for (int i = nums.length - 2; i > -1; i--) {
                rightSums[i] = rightSums[i + 1] + nums[i + 1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSums[i] == rightSums[i]) {
                return i;
            }
        }

        return index;

    }
}
