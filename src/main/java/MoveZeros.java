public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int length = nums.length;

        if (length < 2) {
            return;
        }

        int a = 0, b = 0;

        while (a < length && b < length) {
            if (nums[a] != 0) {
                a++;
            } else {
                if (nums[b] == 0) {
                    b++;
                } else {
                    if (b > a) {
                        int tmp = nums[a];
                        nums[a] = nums[b];
                        nums[b] = tmp;
                    } else {
                        b = a + 1;
                    }
                }
            }
        }
    }

    public void moveNonZeroes(int[] nums) {
        int length = nums.length;

        int current = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[current] = nums[i];
                current++;
            }
        }

        for (int i = current; i < length; i++) {
            nums[i] = 0;
        }
    }

    public void replace(int[] nums) {
        int current = 0;
        int tmp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                tmp = nums[current];
                nums[current] = nums[i];
                nums[i] = tmp;
                current++;
            }
        }
    }
}
