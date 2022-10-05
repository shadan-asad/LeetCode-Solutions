public class _1221_SplitaStringinBalancedStrings {
    class Solution {
        public int balancedStringSplit(String s) {
            int flag = 0, ans = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'R') {
                    flag++;
                }else {
                    flag--;
                }
                if(flag == 0) {
                    ans++;
                }
            }
            return ans;
        }
    }
}
