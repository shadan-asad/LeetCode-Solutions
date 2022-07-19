public class _14_LongestCommonPrefix {
    class Solution {
        String ans = "";
        public String longestCommonPrefix(String[] strs) {
            helper(strs, 0, 1);

            return ans;
        }
        private void helper(String[] s, int i, int j) {
            if(i == s[0].length())
                return;
            if(j == s.length) {
                ans = ans + s[0].charAt(i);
                helper(s, i+1, 1);
            }
            if(j < s.length && i < s[j].length() && i < s[0].length() && s[j].charAt(i) == s[0].charAt(i)) {
                helper(s, i, j+1);
            }else {
                return;
            }
        }
    }
}
