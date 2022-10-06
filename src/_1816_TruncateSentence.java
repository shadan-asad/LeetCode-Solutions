public class _1816_TruncateSentence {
    class Solution {
        public String truncateSentence(String s, int k) {
            String[] arr = s.split(" ");
            s = "";
            int i = 0;
            for(; i < k-1; i++) {
                s += arr[i];
                s += " ";
            }
            s += arr[i];
            return s;
        }
    }
}
