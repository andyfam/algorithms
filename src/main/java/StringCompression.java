
public class StringCompression {
    public int compress(char[] chars) {
        char previous = chars[0];
        int count = 1;
        int current = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != previous) {
                if (count > 1) {
                    char[] arr = String.valueOf(count).toCharArray();
                    for (char c : arr) {
                        chars[current++] = c;
                    }
                }
                chars[current++] = chars[i];
                previous = chars[i];
                count = 1;
            } else {
                count++;
                if (i == chars.length - 1) {
                    char[] arr = String.valueOf(count).toCharArray();
                    for (char c : arr) {
                        chars[current++] = c;
                    }
                }
            }
        }

        return current;
    }
}
