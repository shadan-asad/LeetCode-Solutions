public class _1784_CheckifBinaryStringHasatMostOneSegmentofOnes {
    class Solution {
        public boolean checkOnesSegment(String s) {
            int i = 0;
            while(i < s.length() && s.charAt(i) == '1')
                i++;

            if(i == s.length())
                return true;

            for(; i < s.length(); i++) {
                if(s.charAt(i) == '1')
                    return false;
            }

            return true;
        }
    }
}
