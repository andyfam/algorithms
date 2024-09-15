public class MergeStringAlternatively {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        int length = w1.length > w2.length ? w1.length : w2.length;

        char[] w3 = new char[w1.length + w2.length];
        int tmp = 0;
        for (int i = 0; i < length; i++) {
            if (i < w1.length) {
                w3[tmp++] = w1[i];
            }
            if (i < w2.length) {
                w3[tmp++] = w2[i];
            }
        }

        return String.valueOf(w3);
    }
}
