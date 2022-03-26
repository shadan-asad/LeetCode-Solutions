public class _680_ValidPalindromeII {
    class Solution {
        public boolean validPalindrome(String s) {
            if(isPalindrome(s))
                return true;

            for(int i = 0; i < s.length()/2; i++) {
                if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                    String str = s.substring(0, i)+s.substring(i+1, s.length());
                    if(isPalindrome(str))
                        return true;

                    str = s.substring(0, s.length()-1-i)+(s.substring(s.length()-i, s.length()));
                    if(isPalindrome(str))
                        return true;
                    else
                        return false;
                }
            }

            return false;
        }

        public boolean isPalindrome(String st) {
            for(int i = 0; i < st.length()/2; i++) {
                if(st.charAt(i) != st.charAt(st.length()-1-i))
                    return false;

            }
            return true;
        }
    }
}
