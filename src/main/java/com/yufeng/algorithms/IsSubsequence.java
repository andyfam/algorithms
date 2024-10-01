package com.yufeng.algorithms;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        if(t.isEmpty()){
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int lengthS = sArr.length;
        int lengthT = tArr.length;
        int a = 0;
        int b = 0;

        while (a < lengthS && b < lengthT) {
            if (sArr[a] == tArr[b]) {
                a++;
            }
            b++;
        }

        if (a == lengthS) {
            return true;
        } else {
            return false;
        }

    }
}
