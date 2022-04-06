public class _2000_ReversePrefixofWord {
    class Solution {
        public String reversePrefix(String word, char ch) {
            if(word.indexOf(ch) == -1 || word.length() == 1 || word.indexOf(ch) == 0)
                return word;

            int i = 0;
            String str = "";
            while(word.charAt(i) != ch) {
                str = word.charAt(i)+str;
                i++;
            }
            str = ch+str;
            i++;

            str += word.substring(i);

            return str;
        }
    }
}
