public class _2114_MaximumNumberofWordsFoundinSentences {
    class Solution {
        public int mostWordsFound(String[] sentences) {
            int max = 0;
            for(String s : sentences) {
                int count = 0;
                for(int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) == ' ') {
                        count++;
                    }
                }
                if(count > max) {
                    max = count;
                }
            }
            return max+1;
        }
    }
}
