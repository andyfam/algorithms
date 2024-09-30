public class MaxAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double result = 0;
        for (int i = 0; i < k; i++) {
            result += nums[i];
        }

        if (nums.length > k) {
            double tmp = result;
            for (int i = 1; i <= nums.length - k; i++) {
                tmp = tmp + nums[i + k - 1] - nums[i - 1];
                if (tmp > result) {
                    result = tmp;
                }
            }
        }


        return result / k;

    }
}
