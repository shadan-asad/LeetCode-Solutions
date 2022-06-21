public class _206_ReverseLinkedList {

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode one, temp, next;
            try{
                one = head;
                temp = one.next;
                next = temp.next;
            } catch (Exception e) {

                return head;
            }

            one.next = null;
            while(next != null) {
                temp.next = one;
                one = temp;
                temp = next;
                next = next.next;
            }
            temp.next = one;
            return temp;
        }
    }
}
