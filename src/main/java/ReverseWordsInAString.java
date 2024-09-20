import java.util.Stack;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] strs = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i > -1; i--) {
            sb.append(strs[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
