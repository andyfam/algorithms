import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] resluts = new int[length];


        for (int i = 0; i < length; i++) {
            int tmp = 1;
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    tmp *= nums[j];
                }
            }

            resluts[i] = tmp;
        }

        return resluts;
    }

    public int[] divideBySelf(int[] nums) {
        int length = nums.length;
        int[] resluts = new int[length];

        int product = 1;
        int zeroIndex = -1;
        boolean moreThanOneZero = false;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                if (zeroIndex != -1) {
                    moreThanOneZero = true;
                    break;
                }
                zeroIndex = i;
                continue;
            }
            product *= nums[i];
        }

        if (moreThanOneZero) {
            Arrays.fill(resluts, 0);
            return resluts;
        }

        if (zeroIndex != -1) {
            Arrays.fill(resluts, 0);
            resluts[zeroIndex] = product;
            return resluts;
        }

        for (int i = 0; i < length; i++) {
            resluts[i] = product / nums[i];
        }

        return resluts;
    }

    public int[] prefixAndSuffix(int[] nums) {
        int length = nums.length;
        int[] resluts = new int[length];
        int[] prefixs = new int[length];
        int[] suffixs = new int[length];

        prefixs[0] = 1;
        suffixs[length - 1] = 1;

        for (int i = 1; i < length; i++) {
            prefixs[i] = nums[i - 1] * prefixs[i - 1];
        }

        for (int i = length - 2; i > -1; i--) {
            suffixs[i] = nums[i + 1] * suffixs[i + 1];
        }

        for (int i = 0; i < length; i++) {
            resluts[i] = prefixs[i] * suffixs[i];
        }

        return resluts;
    }

    public int[] prefixAndSuffixWithOneArray(int[] nums) {
        int length = nums.length;
        int[] results = new int[length];

        results[0] = 1;
        for (int i = 1; i < length; i++) {
            results[i] = nums[i - 1] * results[i - 1];
        }

        int tmp = 1;
        for (int i = length - 2; i > -1; i--) {
            tmp *= nums[i + 1];
            results[i] *= tmp;
        }

        return results;
    }
}
