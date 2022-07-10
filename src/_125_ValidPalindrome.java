public class _125_ValidPalindrome {
    //Recusive solution
    class Solution {
        public boolean isPalindrome(String s) {
            s = s.replaceAll("[^a-zA-Z0-9]","");
            s = s.toLowerCase();
            return palin(s, 0, s.length()-1);
        }
        private boolean palin(String s, int l, int r) {
            if(l > r)
                return true;

            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++; r--;
            boolean ans = palin(s, l, r);
            return ans;
        }
    }
}
