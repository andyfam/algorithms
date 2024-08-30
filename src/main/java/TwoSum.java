import java.util.HashMap;

public class TwoSum {
    public int[] bruteForce(int[] nums, int target) {
        int index1 = 0, index2 = 1;

        outerloop:
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index1 = i;
                    index2 = j;
                    break outerloop;
                }
            }
        }

        return new int[]{index1, index2};
    }

    public int[] hashTable(int[] nums, int target) {
        int index1 = 0, index2 = 1;

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        int result;
        for (int i = 0; i < nums.length; i++) {
            result = target - nums[i];
            if (hashMap.containsKey(result)) {
                index1 = hashMap.get(result);
                index2 = i;
                break;
            } else {
                hashMap.put(nums[i], i);
            }
        }

        return new int[]{index1, index2};
    }
}
