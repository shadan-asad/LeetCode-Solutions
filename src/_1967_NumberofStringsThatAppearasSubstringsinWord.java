public class _1967_NumberofStringsThatAppearasSubstringsinWord {
    class Solution {
        public int numOfStrings(String[] patterns, String word) {
            int count = 0;
            for(String s : patterns) {
                if(word.contains(s))
                    count++;
            }
            return count;
        }
    }
}
