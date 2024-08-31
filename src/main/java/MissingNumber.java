import java.util.Arrays;

public class MissingNumber {
    public int loop(int[] nums) {
        int missing = -1;

        boolean exists = false;
        for (int i = 0; i < nums.length + 1; i++) {
            exists = false;

            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                missing = i;
                break;
            }
        }

        return missing;
    }

    public int vector(int[] nums) {
        int missing = -1;

        int n = nums.length;
        int[] v = new int[n + 1];

        Arrays.fill(v, -1);
        for (int i = 0; i < n; i++) {
            v[nums[i]] = nums[i];
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] == -1) {
                missing = i;
            }
        }

        return missing;
    }

    public int xor(int[] nums) {
        int n = nums.length;

        int xor = 0;
        for (int i = 1; i <= n; i++) {
            xor = xor ^ i;
        }

        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }

        return xor;
    }

    public int sum(int[] nums) {
        int n = nums.length;
        int sum1 = n * (n + 1) / 2;
        int sum2 = Arrays.stream(nums).sum();

        return sum1 - sum2;
    }

    public int order(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);

        if(nums[n-1] != n) return n;

        int missing = -1;
        for(int i=0; i< n;i++){
            if(nums[i] != i){
                missing = i;
                break;
            }
        }

        return missing;
    }
}
