public class _557_ReverseWordsinaStringIII {
    class Solution {
        public String reverseWords(String s) {
            String str = "";
            for(int i = s.length()-1; i >= 0; i--) {
                str += s.charAt(i);
            }
            String[] arr = str.split(" ");
            str = "";
            for(int i = arr.length-1; i >= 0; i--)
                str += arr[i]+" ";

            return str.substring(0, str.length()-1);
        }
    }
}
