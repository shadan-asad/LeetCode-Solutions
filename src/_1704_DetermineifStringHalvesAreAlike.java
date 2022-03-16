public class _1704_DetermineifStringHalvesAreAlike {
    class Solution {
        public boolean halvesAreAlike(String s) {
            String s1, s2;
            s1 = s.substring(0, s.length()/2);
            s2 = s.substring(s.length()/2);

            int c1 = 0, c2 = 0;
            for(int i = 0; i < s1.length(); i++) {
                if(isVowel(s1.charAt(i))) {
                    c1++;
                }
            }
            for(int i = 0; i < s2.length(); i++) {
                if(isVowel(s2.charAt(i))) {
                    c2++;
                }
            }
            if(c1 == c2)
                return true;

            return false;
        }

        public boolean isVowel(char c) {
            String str = "aeiouAEIOU";
            if(str.indexOf(c) != -1)
                return true;

            return false;
        }
    }
}
