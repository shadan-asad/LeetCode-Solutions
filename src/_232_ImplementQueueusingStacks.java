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
            while(!a.isEmpty())
                b.push(a.pop());
            int ans = b.pop();
            while(!b.isEmpty())
                a.push(b.pop());

            return ans;
        }

        public int peek() {
            while(!a.isEmpty())
                b.push(a.pop());
            int ans = b.peek();
            while(!b.isEmpty())
                a.push(b.pop());

            return ans;
        }

        public boolean empty() {
            return a.isEmpty();
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
