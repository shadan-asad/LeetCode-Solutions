public class _1047_RemoveAllAdjacentDuplicatesInString {
    class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> st = new Stack<Character>();

            for(int i = 0; i < s.length(); i++) {
                if(!(st.isEmpty()) && s.charAt(i) == st.peek()) {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }

            String str = "";
            for(Character c : st)
                str = str+c;

            return str;
        }
    }
}
