public class NumberOf1Bits {
    public int binaryString(int n) {
        String bitString = Integer.toBinaryString(n);

        int res = 0;
        for (int i = 0; i < bitString.length(); i++) {
            if ('1' == bitString.charAt(i)) {
                res++;
            }
        }

        return res;
    }

    public int bitWiseAnd(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public int unsignedRightShift(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}
