import java.util.List;

public class _1239_MaximumLengthofaConcatenatedStringwithUniqueCharacters {
    class Solution {
        public int maxLength(List<String> arr) {
            String s = "";
            int max = 0;

            return help(0, s, max, arr);
        }

        private int help(int i, String s, int max, List<String> arr) {

            if(i == arr.size()) {
                return max;
            }

            //check if there are unique chars in the i-th string and current string
            if(!valid(s, arr.get(i))) {
                return help(i+1, s, max, arr);
            }

            //add
            s += arr.get(i);
            max += arr.get(i).length();
            int one = help(i+1, s, max, arr);

            //dont add
            s = s.substring(0, s.length()-arr.get(i).length());
            max -= arr.get(i).length();
            int two = help(i+1, s, max, arr);

            if(one > two)
                return one;
            return two;
        }

        private boolean valid(String s, String t) {
            // to check if there are duplicate characters in the given strings

            int[] arr = new int[26];
            for(int i = 0; i < t.length(); i++) {
                if(arr[t.charAt(i)-'a'] == 1) {
                    return false;
                }
                arr[t.charAt(i)-'a'] = 1;
            }
            for(int i = 0; i < s.length(); i++) {
                if(arr[s.charAt(i)-'a'] == 1) {
                    return false;
                }
                arr[s.charAt(i)-'a'] = 1;
            }
            return true;
        }
    }
}
