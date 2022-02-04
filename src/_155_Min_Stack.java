import java.util.*;
public class _155_Min_Stack {
    class MinStack {
        ArrayList<Integer> list;
        Integer min;

        public MinStack() {
            list = new ArrayList<Integer>();
            min = null;
        }

        public void push(int val) {
            list.add(val);
            if(min == null) {
                min = val;
                return;
            }
            if(val < min)
                min = val;
        }

        public void pop() {
            int i = list.size()-1;
            if(min.equals(list.get(i))) {
                list.remove(i);
                if(list.size() > 0) {
                    min = Collections.min(list);
                }
                else
                    min = null;
            } else {
                list.remove(i);
            }

        }

        public int top() {
            return list.get(list.size()-1);
        }

        public int getMin() {
            return min;
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
