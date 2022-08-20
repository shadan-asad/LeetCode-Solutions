import java.util.Stack;

public class _844_BackspaceStringCompare {
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            Stack<Character> st = new Stack<>();
            for(Character c : s.toCharArray()) {
                if(c == '#') {
                    if(!st.isEmpty())
                        st.pop();
                }else {
                    st.push(c);
                }
            }
            s = st.toString();
            st.clear();

            for(Character c : t.toCharArray()) {
                if(c == '#') {
                    if(!st.isEmpty())
                        st.pop();
                } else {
                    st.push(c);
                }
            }
            t = st.toString();
            if(s.equals(t))
                return true;
            return false;
        }
    }
}
