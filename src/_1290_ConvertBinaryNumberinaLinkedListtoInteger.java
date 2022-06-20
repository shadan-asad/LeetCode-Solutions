import java.util.ArrayList;

public class _1290_ConvertBinaryNumberinaLinkedListtoInteger {

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public int getDecimalValue(ListNode head) {
            ArrayList<Integer> bin = new ArrayList<>();
            int m = 1, num = 0;
            while(head != null) {
                bin.add(head.val);
                head = head.next;
            }
            int i = bin.size()-1;
            while(i >= 0) {
                num = (bin.get(i)) * m + num;
                i--;
                m *= 2;

            }

            return num;
        }
    }
}
