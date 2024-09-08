import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);
    }

    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));
        }
        return memo.get(n);
    }

    public int iterate(int n) {
        int[] results = new int[n + 1];
        results[0] = 1;
        results[1] = 1;

        for (int i = 2; i <= n; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }

        return results[n];
    }

    public int iterateByTwoNums(int n) {
        int current = 1;
        int pre = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = current;
            current = current + pre;
            pre = tmp;
        }

        return current;
    }
}
