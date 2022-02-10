import java.util.Stack;

public class GFG_DeleteMiddleElementOfAStack {
    class Solution
    {
        //Function to delete middle element of a stack.
        public void deleteMid(Stack<Integer>s,int sizeOfStack){
            // code here

            Stack<Integer> temp = new Stack<Integer>();
            int count = sizeOfStack/2;

            while(count > 0) {
                temp.push(s.pop());
                count--;
            }

            s.pop();

            while(!temp.isEmpty()) {
                s.push(temp.pop());
            }
        }
    }
}
