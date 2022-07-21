import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _17_LetterCombinationsofaPhoneNumber {
    class Solution {
        public List<String> letterCombinations(String digits) {
            HashMap<Integer, String> hm = new HashMap<>();

            for(int i = 0; i < digits.length(); i++) {
                int start = 97;
                int n = digits.charAt(i) - '0';
                String t = "";
                if(n >= 8)
                    start++;
                t += (char)((n-2)*3 + start);
                t += (char)((n-2)*3 + start+1);
                t += (char)((n-2)*3 + start+2);
                if(n == 9 || n == 7) {
                    start++;
                    t += (char)((n-2)*3 + (start+2));
                }
                hm.put(n, t);
            }
            List<String> ans = new ArrayList<String>();
            String sub = "";
            helper(digits, ans, hm);
            return ans;
        }
        private void helper(String digits, List<String> ans, HashMap<Integer, String> hm) {
            if(digits.length() == 0)
                return;
            if(digits.length() == 1) {
                int x = digits.charAt(0) - '0';
                for(int a = 0; a < hm.get(x).length(); a++)
                    ans.add(hm.get(x).substring(a,a+1));
                return;
            }

            helper(digits.substring(1), ans, hm);
            String temp = hm.get(digits.charAt(0)-'0');
            int size = ans.size();
            for(int j = 0; j < temp.length(); j++)
                for(int k = 0; k < size; k++) {
                    ans.add(temp.charAt(j)+ans.get(k));
                }
            while(size-- > 0)
                ans.remove(0);
        }
    }
}
