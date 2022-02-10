import java.util.*;

public class GFG_ReverseFirstKElementsofQueue {
    class GfG {
        // Function to reverse first k elements of a queue.
        public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
            // add code here.
            Object[] arr = q.toArray();
            k--;
            int i = 0;

            while(i < k) {
                Object temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k--;
            }
            q.clear();

            for(Object x : arr) {
                q.add((Integer)(x));
            }
            return q;
        }
    }
}
