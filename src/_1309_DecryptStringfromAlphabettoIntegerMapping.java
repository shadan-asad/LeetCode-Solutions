public class _1309_DecryptStringfromAlphabettoIntegerMapping {
    class Solution {
        public String freqAlphabets(String s) {
            // a to i = 1 to 9
            //j to z = 10# to 26#
            StringBuilder str = new StringBuilder("");
            for(int i = s.length()-1; i >= 0; i--) {
                int x;
                if(s.charAt(i) == '#') {
                    i = i-2;
                    x = Integer.parseInt((s.substring(i, i+2)));
                }else
                    x = Integer.parseInt((s.substring(i, i+1)));
                str.append((char)(x+96));
            }

            return str.reverse().toString();
        }
    }
}
