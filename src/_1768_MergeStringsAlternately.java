public class _1768_MergeStringsAlternately {
    class Solution {
        public String mergeAlternately(String word1, String word2) {
            String str = "";
            int i = 0, j = 0;
            while(i < word1.length() && i < word2.length()) {
                str = str + word1.charAt(i) + word2.charAt(i);
                i++;
            }

            while(i < word1.length()) {
                str = str + word1.charAt(i);
                i++;
            }

            while(i < word2.length()) {
                str = str + word2.charAt(i);
                i++;
            }

            return str;
        }
    }
}
