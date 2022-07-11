import java.util.Collections;
import java.util.LinkedList;

public class _155_MinStack {
    class MinStack {
        LinkedList<Integer> list;
        public MinStack() {
            this.list = new LinkedList<Integer>();
        }

        public void push(int val) {
            this.list.push(val);
        }

        public void pop() {
            this.list.pop();
        }

        public int top() {
            return list.peek();
        }

        public int getMin() {
            return Collections.min(this.list);
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
