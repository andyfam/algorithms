package com.yufeng.algorithms;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        String shorter;
        String longer;

        if (str1.length() > str2.length()) {
            shorter = str2;
            longer = str1;
        } else {
            shorter = str1;
            longer = str2;
        }

        int length = shorter.length();

        String tmp = "";
        for (int i = length; i > 0; i--) {
            tmp = shorter.substring(0, i);
            if (shorter.replaceAll(tmp, "").equals("") && longer.replaceAll(tmp, "").equals("")) {
                return tmp;
            }

            if (i == 1) {
                tmp = "";
            }
        }

        return tmp;
    }

    public String gcdOfStrings2(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int a, int b) {
        return b == 0 ? a :  gcd(b,a % b);
    }
}
