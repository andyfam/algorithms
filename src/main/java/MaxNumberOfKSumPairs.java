import java.util.*;

public class MaxNumberOfKSumPairs {
    public int map1(int[] nums, int k) {
        if (nums.length < 2) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;
        for (int num : nums) {
            int tmp = k - num;
            if (map.containsKey(tmp) && map.get(tmp) > 0) {
                total++;
                map.put(tmp, map.get(tmp) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return total;
    }

    public int map2(int[] nums, int k) {
        if (nums.length < 2) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int total = 0;
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (set.contains(entry.getKey())) {
                continue;
            }

            if (entry.getKey() * 2 == k) {
                total += entry.getValue() / 2;
            } else {
                int tmp = k - entry.getKey();
                if (map.containsKey(tmp)) {
                    total += Math.min(entry.getValue(), map.get(tmp));
                    set.add(tmp);
                }
            }

        }

        return total;
    }

    public int maxOperations(int[] nums, int k) {
        int length = nums.length;
        if (length < 2) {
            return 0;
        }

        Arrays.sort(nums);
        int low = 0;
        int high = length - 1;

        int total = 0;
        while (low < high) {
            int tmp = nums[low] + nums[high];
            if (tmp == k) {
                total++;
                low++;
                high--;
            } else if (tmp > k) {
                high--;
            } else {
                low++;
            }
        }

        return total;
    }
}
