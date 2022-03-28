public class _14_LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String s = "";
            if(strs.length == 1)
                return strs[0];

            for(int i = 0; i < strs[0].length(); i++) {
                for(int j = 1; j < strs.length; j++) {
                    if(i == strs[j].length())
                        return s;
                    if(strs[0].charAt(i) != strs[j].charAt(i))
                        return s;

                }
                s += strs[0].charAt(i);
            }
            return s;
        }
    }
}
