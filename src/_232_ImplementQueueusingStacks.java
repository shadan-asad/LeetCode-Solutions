import java.util.Stack;

public class _232_ImplementQueueusingStacks {
    class MyQueue {

        Stack<Integer> a, b;
        public MyQueue() {
            a = new Stack<>();
            b = new Stack<>();
        }

        public void push(int x) {
            a.push(x);
        }

        public int pop() {
            peek();
            return b.pop();
        }

        public int peek() {
            if(b.isEmpty())
                while(!a.isEmpty())
                    b.push(a.pop());
            int ans = b.peek();

            return ans;
        }

        public boolean empty() {
            return (a.isEmpty() && b.isEmpty());
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
