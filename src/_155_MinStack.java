import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class _155_MinStack {
    class MinStack {

        class Node {
            int val, min;
            Node next;

            Node(int v, int m, Node n) {
                this.val = v;
                this.min = m;
                this.next = n;
            }
        }

        Node head;

        public MinStack() {

        }

        public void push(int val) {
            if(head == null) {
                head = new Node(val, val, null);
            }else {
                Node t = new Node(val, Math.min(val, head.min), head);
                head = t;
            }
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.val;
        }

        public int getMin() {
            return head.min;
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
