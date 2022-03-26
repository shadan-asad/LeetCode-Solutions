public class _125_ValidPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            if(s.length() == 1)
                return true;

            String str = "";
            for(int i = 0; i < s.length(); i++) {
                if(Character.isLetterOrDigit(s.charAt(i)))
                    str += s.charAt(i);
            }
            str = str.toLowerCase();

            if(str.length() <= 1)
                return true;

            for(int i = 0; i < str.length()/2; i++) {
                if(str.charAt(i) != str.charAt(str.length()-1-i))
                    return false;
            }

            return true;
        }
    }
}
