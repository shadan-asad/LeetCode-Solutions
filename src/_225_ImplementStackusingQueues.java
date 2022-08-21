import java.util.ArrayDeque;
import java.util.Queue;

public class _225_ImplementStackusingQueues {
    class MyStack {

        Queue<Integer> q;
        Queue<Integer> r;
        public MyStack() {
            q = new ArrayDeque<Integer>();
            r = new ArrayDeque<Integer>();
        }

        public void push(int x) {
            if(q.isEmpty())
                r.add(x);
            else
                q.add(x);
        }

        public int pop() {
            if(q.isEmpty()) {
                while(!r.isEmpty()) {
                    int x = r.remove();
                    if(r.isEmpty()) {
                        return x;
                    }
                    q.add(x);
                }
            }else {
                while(!q.isEmpty()) {
                    int x = q.remove();
                    if(q.isEmpty()) {
                        return x;
                    }
                    r.add(x);
                }
            }
            return -1;
        }

        public int top() {
            int x = pop();
            if(q.isEmpty()) {
                r.add(x);
            }else {
                q.add(x);
            }
            return x;
        }

        public boolean empty() {
            return (q.isEmpty() && r.isEmpty());
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
