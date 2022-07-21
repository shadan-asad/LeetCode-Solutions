import java.util.ArrayList;
import java.util.List;

public class _17_LetterCombinationsofaPhoneNumber {
    class Solution {
        public List<String> letterCombinations(String digits) {

            String[] num = new String[10];
            num[2] = "abc"; num[3] = "def"; num[4] = "ghi"; num[5] = "jkl"; num[6] = "mno";
            num[7] = "pqrs"; num[8] = "tuv"; num[9] = "wxyz";

            List<String> ans = helper(digits, num);
            return ans;
        }
        private List<String> helper(String digits, String[] num) {
            if(digits.length() == 0)
                return new ArrayList<String>();
            if(digits.length() == 1) {
                List<String> ans = new ArrayList<String>();
                int x = digits.charAt(0) - '0';
                for(int a = 0; a < num[x].length(); a++)
                    ans.add(num[x].substring(a,a+1));
                return ans;
            }

            List<String> subans = helper(digits.substring(1), num);
            String temp = num[(digits.charAt(0)-'0')];

            List<String> list = new ArrayList<String>();
            for(int j = 0; j < temp.length(); j++)
                for(String k : subans) {
                    list.add(temp.charAt(j)+k);
                }
            return list;
        }
    }
}
