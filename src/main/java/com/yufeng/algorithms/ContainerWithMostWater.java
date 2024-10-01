package com.yufeng.algorithms;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int a = 0;
        int b = height.length - 1;

        int tmp = 0;
        while (a < b) {
            int res;
            if (height[a] < height[b]) {
                res = height[a] * (b - a);
                a++;
            } else {
                res = height[b] * (b - a);
                b--;
            }

            tmp = res > tmp ? res : tmp;
        }

        return tmp;
    }
}
