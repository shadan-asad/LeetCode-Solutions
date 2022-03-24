public class _28_ImplementstrStr {
    class Solution {
        public int strStr(String haystack, String needle) {
            if(needle.length() == 0)
                return 0;

            if(haystack.length() == 0)
                return -1;


            if(haystack.equals(needle)) {
                return 0;
            }
            for(int i = 0; i <= haystack.length()-needle.length(); i++) {
                int j = 0, k = i;

                while(k < haystack.length() && j < needle.length() && (haystack.charAt(k) ==                                    needle.charAt(j))) {
                    k++;
                    j++;
                }
                if(j == needle.length())
                    return i;
            }

            return -1;
        }
    }
}
