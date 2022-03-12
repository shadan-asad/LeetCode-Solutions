public class _1859_SortingTheSentence {
    class Solution {
        public String sortSentence(String s) {
            String str = "";
            String[] strArr = s.split(" ");
            String[] arr = new String[strArr.length];

            for(String word : strArr) {
                int pos = word.charAt(word.length()-1) - '0';
                arr[pos-1] = word.substring(0, word.length()-1);
            }
            for(String word : arr) {
                str += word+" ";
            }


            return str.substring(0, str.length()-1);
        }
    }
}
