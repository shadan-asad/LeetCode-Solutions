public class _709_ToLowerCase {
    class Solution {
        public String toLowerCase(String s) {
            String str = "";
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                    str += (char)(s.charAt(i)+32);
                }else {
                    str += s.charAt(i);
                }
            }
            return str;
        }
    }
}
