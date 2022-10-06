public class _1816_TruncateSentence {
    class Solution {
        public String truncateSentence(String s, int k) {
            String ans = "";
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ' ') {
                    k--;
                    if(k == 0) {
                        break;
                    }
                    ans += ' ';
                }else {
                    ans += s.charAt(i);
                }

            }
            return ans;
        }
    }
}
