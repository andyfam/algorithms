package com.yufeng.algorithms;

public class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = get1s(i);
        }
        return ans;
    }

    private int get1s(int i) {
        int count = 0;
        while (i > 0) {
            count += i & 1;
            i >>>= 1;
        }

        return count;
    }

    public int[] iterate(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = ans[i / 2] + i % 2;
        }
        return ans;
    }
}
