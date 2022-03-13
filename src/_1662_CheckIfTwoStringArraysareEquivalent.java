public class _1662_CheckIfTwoStringArraysareEquivalent {
    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            String str1 = "", str2 = "";
            for(String word : word1)
                str1 += word;

            for(String word : word2)
                str2 += word;

            if(str1.equals(str2))
                return true;

            return false;
        }
    }
}
