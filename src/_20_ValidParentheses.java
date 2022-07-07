import java.util.Stack;

public class _20_ValidParentheses {
    class Solution {
        public boolean isValid(String s) {
            if(s.length() % 2 != 0)
                return false;

            Stack<Character> stack = new Stack<Character>();
            int i = 0;
            for(i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if(!stack.isEmpty()){
                    if((c == ')' && stack.peek() != '(') ||
                            (c == '}' && stack.peek() != '{') ||
                            (c == ']' && stack.peek() != '[')
                    ) {
                        return false;
                    }
                    stack.pop();
                } else {
                    return false;
                }
            }
            if(i == s.length() && stack.isEmpty())
                return true;

            return false;
        }
    }
}
