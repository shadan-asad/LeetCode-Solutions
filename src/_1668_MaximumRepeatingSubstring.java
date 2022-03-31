public class _1668_MaximumRepeatingSubstring {
    class Solution {
        public int maxRepeating(String sequence, String word) {
            int k = 0;
            String str = word;
            while(sequence.contains(str)) {
                k++;
                str += word;
            }
            return k;
        }
    }
}
