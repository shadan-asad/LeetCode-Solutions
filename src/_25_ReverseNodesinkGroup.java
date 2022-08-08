import java.util.ArrayDeque;

public class _25_ReverseNodesinkGroup {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode temp = head;
            head = null;
            ListNode prev = null;
            ArrayDeque<ListNode> st = new ArrayDeque<>();

            while(true) {
                int x = k;
                while(x > 0 && temp != null) {
                    st.push(temp);
                    temp = temp.next;
                    x--;
                }
                if(x == 0) {
                    ListNode temp2 = st.pop();
                    if(prev != null) {
                        prev.next = temp2;
                    }else {
                        head = temp2;
                    }

                    while(!st.isEmpty()) {
                        temp2.next = st.pop();
                        temp2 = temp2.next;
                    }
                    prev = temp2;
                    temp2.next = null;
                }else {
                    while(!st.isEmpty()) {
                        prev.next = st.pop();
                    }
                    break;
                }
            }
            return head;
        }
    }
}
